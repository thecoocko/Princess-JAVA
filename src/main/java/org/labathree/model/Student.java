package org.labathree.model;


public  class Student implements Human  {

    private final String gender;
    Sex[] gender1= Sex.values();

    public Student(String gender){
        this.gender=gender;
    }


    public  void print(){
        for (Sex g : Sex.values()) {
            if(g.name().equals(gender)){
                System.out.println("THIS IS A BOY!!");
            }
        }
    }
}
