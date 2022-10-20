package org.labathree.controller;

import org.labathree.models.university.Faculty;
import org.labathree.models.university.Group;
import org.labathree.models.university.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FacultyCreate {

    public Faculty create(int amountOfGroups, String name){
        Random random = new Random();
        int randName = random.nextInt(1,500);
        GroupCreate groupCreate = new GroupCreate();
        Faculty faculty = new Faculty();
        List<Group> groups = new ArrayList<>();
        for (int i = 0; i < amountOfGroups; i++) {
            Group group = groupCreate.create(40,"Group "+ randName);
            groups.add(group);
        }
        faculty.setGroups(groups);
        faculty.setName(name);

        return faculty;
    }
}
