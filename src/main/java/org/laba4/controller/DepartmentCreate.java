package org.laba4.controller;

import org.laba4.models.university.Department;
import org.laba4.models.university.Group;
import org.laba4.models.university.Human;

import java.util.List;

public interface DepartmentCreate {
    default Department createDepartment(List<Group> groups,Human boss, String name){
        Department department = new Department();
        department.setBoss(boss);
        department.setName(name);
        department.setGroupList(groups);
        return department;
    }
}
