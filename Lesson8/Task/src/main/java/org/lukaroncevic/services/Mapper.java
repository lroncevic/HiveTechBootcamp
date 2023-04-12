package org.lukaroncevic.services;

import org.lukaroncevic.model.Student;

@FunctionalInterface
public interface Mapper {

    Student map (Student student);
}
