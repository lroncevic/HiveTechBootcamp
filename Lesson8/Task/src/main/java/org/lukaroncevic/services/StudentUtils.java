package org.lukaroncevic.services;

import org.lukaroncevic.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentUtils {

    public static List<Student> filterStudents(List<Student> students, Filter filter) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (filter.filter(student)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    public static List<Student> mapStudents(List<Student> students, Mapper mapper) {
        List<Student> mappedStudents = new ArrayList<>();
        for (Student student : students) {
            mappedStudents.add(mapper.map(student));
        }
        return mappedStudents;
    }
}
