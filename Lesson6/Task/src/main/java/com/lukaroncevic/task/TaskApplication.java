package com.lukaroncevic.task;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        Logger logger = Logger.getLogger(TaskApplication.class.getName());

        try {
            FileHandler handler = new FileHandler("log.txt");
            logger.addHandler(handler);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        }catch (IOException e){
            logger.warning("Log file couldn't be made: " + e.getMessage());
        }

        try {
            Employee employee1 = payroll.addEmployee("Luka", "Roncevic", -160,45);
            logger.info(employee1.getFirstName() + " " + employee1.getLastName() + ":" + " " + employee1.getPayment());
        } catch (InvalidNumberException e) {
            logger.warning(e.getMessage());
        }

        try {
            Employee employee2 = payroll.addEmployee("Laura", "Kovacic", 180,50);
            logger.info(employee2.getFirstName() + " " + employee2.getLastName() + ":" + " " + employee2.getPayment());
        } catch (InvalidNumberException e) {
            logger.warning(e.getMessage());
        }
    }
}
