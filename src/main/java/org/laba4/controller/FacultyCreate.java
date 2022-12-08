package org.laba4.controller;

import org.laba4.models.university.Department;
import org.laba4.models.university.Faculty;
import org.laba4.models.university.Human;


import java.util.List;


public interface FacultyCreate {

    default Faculty create(List<Department> departments, Human boss, String facultyName) {
        Faculty faculty = new Faculty();
        faculty.setBoss(boss);
        faculty.setDepartments(departments);
        faculty.setName(facultyName);

        return faculty;

    }
}
