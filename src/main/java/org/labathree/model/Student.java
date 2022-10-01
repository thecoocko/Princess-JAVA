package org.labathree.model;


public  class Student implements Human  {

    private String gender;
    private String name;
    private String lastName;
    private String group;
    private String faculty;


    public Student(String gender, String name, String lastName, String group, String faculty){
        this.gender=gender;
        this.name=name;
        this.lastName=lastName;
        this.group = group;
        this.faculty=faculty;
    }

    public  void setGender(){
        for (Sex g : Sex.values()) {
            if(g.name().equals(gender)){
                gender = g.name();
            }
        }
    }
    public Student createStudent(){
        return new Student("female","Mykola","Mykolayovych","124-19-2","FIT");
    }

    public String getGender() {
        return gender;
    }
}
