package org.laba4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.laba4.models.university.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class JsonManager {
    Gson gson =  new GsonBuilder().setPrettyPrinting().create();

    public  String objectToJson(University university){
        return gson.toJson(university);
    }

    public  void writerFile(String text, String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\lab works\\JAVA\\oldUniversity.json");
        fileWriter.write(text);
        fileWriter.close();
    }

    public University fileReader(String fileName) throws  IOException{
        FileReader fileReader = new FileReader(fileName);
        University university = gson.fromJson(fileReader,University.class);
        return university;
    }
}
