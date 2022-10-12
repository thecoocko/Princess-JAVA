package org.labathree.controller;
import org.labathree.models.university.Student;

import java.text.MessageFormat;

public class StudentCreate extends Student {

    public StudentCreate(String gender, String name, String lastName, String group, String faculty) {
        super(gender, name, lastName, group, faculty);
    }

    public Student createStudent(String gender, String name, String lastName, String group, String faculty){
        Student newStudent = new Student(gender,name,lastName,group,faculty);
        return newStudent;
    }

    public String getStudent(){
        String string = MessageFormat.format("Student {0} {1}, {2}, {3}, {4}.",this.lastName,this.name,this.gender, this.group, this.faculty);
        return string;
    }

}
