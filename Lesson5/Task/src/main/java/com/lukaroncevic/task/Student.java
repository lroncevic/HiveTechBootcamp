package com.lukaroncevic.task;

public class Student extends Person{

    private int yearOfStudy;
    private String indexNumber;

    Professor professor;

    public Student(String firstName, String lastName, int yearOfStudy, String indexNumber) {
        super(firstName, lastName);
        this.yearOfStudy = yearOfStudy;
        this.indexNumber = indexNumber;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
