package com.lukaroncevic.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) {

        Record record = new Record();

        Professor professor;

        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do {

            System.out.println("Choose option:");
            System.out.println("1. Add new Student");
            System.out.println("2. Find Student by Index Number");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.next();
                    System.out.print("Year of Study: ");
                    int yearOfStudy = scanner.nextInt();
                    System.out.print("Enter Index Number: ");
                    String indexNumber = scanner.next();

                    System.out.print("Enter Professor's First Name: ");
                    String profFirstName = scanner.next();
                    System.out.print("Enter Professor's Last Name: ");
                    String profLastName = scanner.next();

                    professor = record.addProfessor(profFirstName, profLastName);

                    record.addStudent(firstName, lastName, yearOfStudy, indexNumber,professor);
                    record.addProfessor(profFirstName, profLastName);
                    break;

                case 2:
                    System.out.print("Enter Index number: ");
                    String index = scanner.next();
                    record.findStudentByIndexNumber(index);
                    break;

                case 3:
                    record.listAllStudents();
            }

        } while(option < 4);
            System.out.println("Goodbye!");
    }

}
