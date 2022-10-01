package org.labathree.controller;
import org.labathree.model.Student;

public class StudentCreate extends Student {

    public StudentCreate(String gender, String name, String lastName, String group, String faculty) {
        super(gender, name, lastName, group, faculty);
    }

    public Student createStudent(){
        Student newStudent = new Student("female","Mykola","Mykolayovych","124-19-2","FIT");
        return newStudent;
    }
}
