package com.srihari.java.a_basic.a_paradigm.b_object_oriented.e_staticuse;

/**
 * Calculate the Wage of an Employee
 * Basic Salary = 1_00_000
 * Extra Hours = 50
 * Hourly Rate = 100
 * Wage = Basic Salary + (Extra Hours * Hourly Rate)
 *
 * The below programs depicts the Object-Oriented-Programming
 *
 */

public class WageCalculator {
    public static void main(String[] args) {
        var employee = new Employee(1_00_000, 100);
        //int wage = employee.calculateWage(50);
        int wage = employee.calculateWage();
        System.out.println(wage);

        System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployees();
    }
}
