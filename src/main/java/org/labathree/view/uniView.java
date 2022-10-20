package org.labathree.view;

import org.labathree.controller.FacultyCreate;
import org.labathree.models.university.Faculty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class uniView {

    public void view(){
        Scanner input = new Scanner(System.in);
        int amountOfGroups = input.nextInt();
        String [] names = {"Юридичний факультет","Фізкультурний факультет","Медичний факультет","Технологічний факультет"};
        FacultyCreate facultyCreate = new FacultyCreate();
        List<Faculty> faculties = new ArrayList();
        for (int i = 0; i <names.length ; i++) {

            faculties.add(facultyCreate.create(amountOfGroups,names[i]));
        }

        for (int i = 0; i < faculties.size(); i++) {
            for (int j = 0; j <faculties.get(i).getGroups().size() ; j++) {
                for (int k = 0; k < faculties.get(i).getGroups().get(j).getStudents().size(); k++) {
                    System.out.println(faculties.get(i).getGroups().get(j).getStudents().get(k).getGender()
                            +" "+ faculties.get(i).getGroups().get(j).getStudents().get(k).getLastName()
                            +" "+ faculties.get(i).getGroups().get(j).getStudents().get(k).getName()
                            +" "+ faculties.get(i).getGroups().get(j).getStudents().get(k).getGroup()
                            +" "+ faculties.get(i).getGroups().get(j).getStudents().get(k).getFaculty());
                }

            }
        }

    }

}
