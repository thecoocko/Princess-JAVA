package org.laba4.view;

import org.laba4.JsonManager;
import org.laba4.controller.UniversityCreate;
import org.laba4.models.university.University;

import java.io.IOException;


public class uniView {


    public void view() throws IOException {
        String fileNameOld = "D:\\lab works\\JAVA\\oldUniversity.json";
        String fileNameNew = "D:\\lab works\\JAVA\\oldUniversity.json";
        UniversityCreate universityCreate = new UniversityCreate();
        University uni = universityCreate.createTypicalUniversity();
        JsonManager jsonManager = new JsonManager();
        String text = jsonManager.objectToJson(uni);
        System.out.println(text);
        jsonManager.writerFile(text,fileNameOld);
        University university = jsonManager.fileReader(fileNameNew);
        university.getName();

        JsonManager jsonManager1 = new JsonManager();
        String newtext =  jsonManager1.objectToJson(university);
        System.out.println(newtext);

        int a = 3;


    }

}
