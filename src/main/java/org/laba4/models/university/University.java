package org.laba4.models.university;

import java.util.List;

public class University {
    private String name;
    private Human boss;
    private List<Faculty> facultyList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getBoss() {
        return boss;
    }

    public void setBoss(Human boss) {
        this.boss = boss;
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }
}
