package org.labathree.models.university;

import java.util.List;

public class Department  {
    private String name;
    List<Faculty> facultyList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }
}
