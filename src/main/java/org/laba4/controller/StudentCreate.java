package org.laba4.controller;

import org.laba4.models.university.Human;
import org.laba4.models.university.Student;



public interface StudentCreate {

    default Student create(Human person){
        Student newStudent = new Student();
        newStudent.setName(person.getName());
        newStudent.setLastName(person.getLastName());
        newStudent.setGender(person.getGender());

        return newStudent;
    }



}
