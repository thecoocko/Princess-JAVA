package org.laba4.controller;

import org.laba4.models.university.Human;

public interface HumanCreate {
    default Human create(Human.Gender gender, String name, String lastName){
        Human human = new Human();
        human.setGender(gender);
        human.setName(name);
        human.setLastName(lastName);
        return human;
    }
}
