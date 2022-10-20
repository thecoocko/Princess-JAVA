package org.labathree.models.university;


public  class Student extends Human {


public Student(Gender gender, String name, String lastName, String group, String faculty){
    super(gender, name, lastName,group,faculty);

}

    public  Gender getGender(){
    return gender;
//        for (Gender g : Gender.values()) {
//            if(g.name().equals(gender)){
//                return g;
//            }
//        }
//        return null;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }



}
