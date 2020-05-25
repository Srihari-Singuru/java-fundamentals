package com.srihari.java.a_basic.a_paradigm.a_procedure_oriented;

/**
 * Calculate the Wage of an Employee
 * Basic Salary = 1_00_000
 * Extra Hours = 50
 * Hourly Rate = 100
 * Wage = Basic Salary + (Extra Hours * Hourly Rate)
 *
 * The below programs depicts the Procedure-Oriented-Programming
 *
 */

public class WageCalculator {
    public static void main(String[] args) {
        int basicSalary = 1_00_000;
        int extraHours = 50;
        int hourlyRate = 100;

        int wage = calculateWage(basicSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    private static int calculateWage(
            int basicSalary,
            int extraHours,
            int hourlyRate) {

        return basicSalary + (extraHours * hourlyRate);
    }
}
