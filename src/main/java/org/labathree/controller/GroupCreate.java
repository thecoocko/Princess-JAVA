package org.labathree.controller;

import org.labathree.models.university.Group;
import org.labathree.models.university.Human;
import org.labathree.models.university.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroupCreate {

    Group create(int amountOfStudents, String name){
        Random random = new Random();
        int randGender = random.nextInt(0,2);
        int randName = random.nextInt(1,500);
        StudentCreate sc = new StudentCreate();
        Group group = new Group();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < amountOfStudents; i++) {
           Student student = sc.create(Human.Gender.valueOf(String.valueOf(Human.Gender.values()[randGender])),"Name "+randName,
                   "Last Name " + randName,"Group "+ randName,null);
           students.add(student);
        }
        group.setStudents(students);
        group.setName(name);
        return group;
    }
}
