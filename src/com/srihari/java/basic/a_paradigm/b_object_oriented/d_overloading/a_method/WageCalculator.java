package com.srihari.java.basic.a_paradigm.b_object_oriented.d_overloading.a_method;

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
    }
}
