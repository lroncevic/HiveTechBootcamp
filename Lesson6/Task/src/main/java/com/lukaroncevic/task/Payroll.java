package com.lukaroncevic.task;

public class Payroll {

    public Employee addEmployee(String firstName, String lastName, int hourlyRate, int hoursWorked)
            throws InvalidNumberException {

        Employee employee = new Employee(firstName, lastName, hourlyRate, hoursWorked);
        if (hourlyRate < 1 || hoursWorked < 1) {
            throw new InvalidNumberException("Wrong input numbers for Hourly Rate or Hours Worked. Please check again.");
        } else {
            int payment = hourlyRate * hoursWorked;
            employee.setPayment(payment);
        }
        return employee;
    }
}
