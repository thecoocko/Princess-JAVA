package org.labathree.models.university;

import java.util.List;

public class Faculty {
    private String name;
    List<Group> groups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
