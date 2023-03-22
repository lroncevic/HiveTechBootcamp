package com.lukaroncevic.task;

import java.util.ArrayList;
import java.util.List;

public class Record {

    List<Student> studentList = new ArrayList<>();

    public void addStudent(String firstName, String lastName, int yearOfStudy, String indexNumber){
        Student student = new Student(firstName, lastName, yearOfStudy, indexNumber);
        studentList.add(student);
        System.out.println("New Student is saved.");
    }

    public void findStudentByIndexNumber(String indexNumber){
        for(Student element : studentList){
            if(element.getIndexNumber().equals(indexNumber)){
                System.out.println(element.getFirstName() + " " + element.getLastName());
            }
        }
    }

    public void listAllStudents(){
        for(Student element : studentList){
            System.out.println(element.getFirstName() + " " + element.getLastName());
        }
    }
}
