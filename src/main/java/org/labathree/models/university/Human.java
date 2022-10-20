package org.labathree.models.university;

public abstract class Human {

    public enum Gender {male,female,diverse}
    Gender gender;
    String name;
    String lastName;
    String group;
    String faculty;

    public Human(Gender gender, String name, String lastName, String group, String faculty) {
        this.name = name;
        this.lastName = name;
        this.group = name;
        this.faculty = name;
        this.gender=gender;
    }




}
