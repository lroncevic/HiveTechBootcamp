package org.lukaroncevic.services;

import org.lukaroncevic.model.Student;

@FunctionalInterface
public interface Filter {

    boolean filter(Student student);
}
