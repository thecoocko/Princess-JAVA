package org.labathree.controller;
import org.labathree.models.university.Human;
import org.labathree.models.university.Student;



public class StudentCreate {

    public Student create(Human.Gender gender, String name, String lastName, String group, String faculty){

        Student newStudent = new Student(gender, name, lastName, group, faculty);
        newStudent.setGender(gender);
        newStudent.setName(name);
        newStudent.setLastName(lastName);
        newStudent.setGroup(group);
        newStudent.setFaculty(faculty);
        return newStudent;
    }



}
