package com.lukaroncevic.task;

import java.util.ArrayList;
import java.util.List;

public class Record {

    List<Student> studentList = new ArrayList<>();

    public void addStudent(String firstName, String lastName, int yearOfStudy, String indexNumber,
                           Professor professor) {
        Student student = new Student(firstName, lastName, yearOfStudy, indexNumber);
        student.setProfessor(professor);
        studentList.add(student);
        System.out.println("New Student is saved.");
    }

    public Professor addProfessor(String firstName, String lastName) {
        return new Professor(firstName, lastName);
    }

    public void findStudentByIndexNumber(String indexNumber) {
        for (Student element : studentList) {
            if (element.getIndexNumber().equals(indexNumber)) {
                System.out.println(element.getFirstName() + " " + element.getLastName());
            }
        }
    }

    public void listAllStudents() {
        for (Student student : studentList) {
            System.out.println("Student: " + student.getFirstName() + " " + student.getLastName() + " " + "Professor: " +
                    student.getProfessor().getFirstName() + " " + student.getProfessor().getLastName());
        }
    }
}
