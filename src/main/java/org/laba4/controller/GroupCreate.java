package org.laba4.controller;

import org.laba4.models.university.Group;
import org.laba4.models.university.Human;
import org.laba4.models.university.Student;

import java.util.List;


public interface GroupCreate {
    default Group create(List<Student> students, String name,Human boss){
        Group group = new Group();
        group.setBoss(boss);
        group.setName(name);
        group.setStudents(students);
        return group;
    }
}
