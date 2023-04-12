package org.lukaroncevic;

import org.lukaroncevic.model.Student;
import org.lukaroncevic.services.Filter;
import org.lukaroncevic.services.StudentUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Luka", 18, 5));
        students.add(new Student(2, "Laura", 19, 0.4));
        students.add(new Student(3, "Filip", 17, 3));

        List<Student> filteredStudents = StudentUtils.filterStudents(students, student -> student.getGpa() > 1);

        System.out.println("Students that passed year: ");
        filteredStudents.forEach(student -> System.out.println(student.getName()));

        List<Student> mappedStudents = StudentUtils.mapStudents(students, student -> {
            student.setName(student.getName().toUpperCase());
            return student;
        });

        System.out.println("Students with names in uppercase:");
        mappedStudents.forEach(student -> System.out.println(student.getName()));
    }
}