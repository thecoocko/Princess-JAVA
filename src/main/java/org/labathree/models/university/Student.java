package org.labathree.models.university;


public  class Student implements Human {

    public String gender;
    public String name;
    public String lastName;
    public String group;
    public String faculty;


    public Student(String gender, String name, String lastName, String group, String faculty){
        this.gender=gender;
        this.name=name;
        this.lastName=lastName;
        this.group = group;
        this.faculty=faculty;
    }

//    public  Sex setGender(String gender){
//        for (Sex g : Sex.values()) {
//            if(g.name().equals(gender)){
//                return g;
//            }
//        }
//        return null;
//    }

    public String getGender() {
        return gender;
    }
}
