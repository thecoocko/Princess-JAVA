package org.laba4.controller;

import org.jetbrains.annotations.NotNull;
import org.laba4.models.university.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UniversityCreate implements HumanCreate,StudentCreate, GroupCreate, DepartmentCreate,FacultyCreate{

    public University createUni(List<Faculty> facultyList,String name, Human boss){
        University university = new University();
        university.setFacultyList(facultyList);
        university.setName(name);
        university.setBoss(boss);
        return university;
    }

    HumanCreate humanCreate = new HumanCreate() {
        @Override
        public Human create(Human.Gender gender, String name, String lastName) {
            return HumanCreate.super.create(gender, name, lastName);
        }
    };
    StudentCreate studentCreate = new StudentCreate() {
        @Override
        public Student create(@NotNull Human person) {
            return StudentCreate.super.create(person);
        }
    };

    GroupCreate groupCreate = new GroupCreate() {
        @Override
        public Group create(List<Student> students, String name, Human boss) {
            return GroupCreate.super.create(students, name, boss);
        }
    };

    DepartmentCreate departmentCreate = new DepartmentCreate() {
        @Override
        public Department createDepartment(List<Group> groups, Human boss, String name) {
            return DepartmentCreate.super.createDepartment(groups, boss, name);
        }
    };

    FacultyCreate facultyCreate =new FacultyCreate() {
        @Override
        public Faculty create(List<Department> departments, Human boss, String facultyName) {
            return FacultyCreate.super.create(departments, boss, facultyName);
        }
    };

    public  University createTypicalUniversity() {

        List<Student> students = new ArrayList<>();
        List<Group> groups = new ArrayList<>();
        List<Department> departments = new ArrayList<>();
        List<Faculty> faculties = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 5; i++) {
            Human human = humanCreate.create(Human.Gender.values()[random.nextInt(0,2)],"Student"+i,"Studentovich"+i+10);
            Student student =  studentCreate.create(human);
            students.add(student);
        }

        Human groupBoss1 = humanCreate.create(Human.Gender.values()[random.nextInt(1,2)],"GroupBoss1","GroupBoss1");
        Human groupBoss2 = humanCreate.create(Human.Gender.values()[random.nextInt(0,2)],"GroupBoss2","GroupBoss2");
        Human departmentBoss1 = humanCreate.create(Human.Gender.values()[random.nextInt(1,2)],"DepartmentBoss1","DepartmentBoss1");
        Human departmentBoss2 = humanCreate.create(Human.Gender.values()[random.nextInt(1,2)],"DepartmentBoss2","DepartmentBoss2");
        Human facultyBoss1 = humanCreate.create(Human.Gender.values()[random.nextInt(0,2)],"FacultyBoss1","FacultyBoss1");
        Human facultyBoss2 = humanCreate.create(Human.Gender.values()[random.nextInt(0,2)],"FacultyBoss2","FacultyBoss2");
        Human uniBoss = humanCreate.create(Human.Gender.diverse,"UNIBOSS","UNIBOSS");

        Group group1 = groupCreate.create(students,"123-12-1",groupBoss1);
        Group group2 = groupCreate.create(students,"122-15-16",groupBoss2);
        groups.add(group1);
        groups.add(group2);

        Department department1 = departmentCreate.createDepartment(groups,departmentBoss1,"Department1");
        Department department2 = departmentCreate.createDepartment(groups,departmentBoss2,"Department2");
        departments.add(department1);
        departments.add(department2);

        Faculty faculty1 = facultyCreate.create(departments,facultyBoss1,"Faculty1");
        Faculty faculty2 = facultyCreate.create(departments,facultyBoss2,"Faculty2");
        faculties.add(faculty1);
        faculties.add(faculty2);

        University university = createUni(faculties,"UNI",uniBoss);


        university.getFacultyList().forEach(fc->fc.getDepartments()
                .forEach(dep -> dep.getGroupList()
                        .forEach(gr -> gr.getStudents()
                                .forEach(st -> System.out.println(
                                        university.getName()+" "+ university.getBoss().getName() + " " + university.getBoss().getLastName() + " " + university.getBoss().getGender()
                                        +" "+fc.getName() + " " + fc.getBoss().getName() + " " + fc.getBoss().getLastName() + " " + fc.getBoss().getGender()
                                                + " " + dep.getName() + " " + dep.getBoss().getName() + " " + dep.getBoss().getLastName() + " " + dep.getBoss().getGender()
                                                + " " + gr.getName() + " " + gr.getBoss().getName() + " " + gr.getBoss().getLastName() + " " + gr.getBoss().getGender()
                                                + " " + st.getLastName() + " " + st.getName()
                                                + " " + st.getGender() + " "
                                )))));

        return university;
    }
}
