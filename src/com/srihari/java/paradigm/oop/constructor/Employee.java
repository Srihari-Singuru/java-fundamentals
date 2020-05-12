package com.srihari.java.paradigm.oop.constructor;

/**
 * We are refactoring the class by having constructors
 * and also by making setters and getters private
 * so that, the called will have access to only one method (calcualateWage)
 *
 * by doing this, we are making sure that we are providing the initial state to the employee object when it is created
 * otherwise, the called may simply create an object with default constructor and not set the required values
 * then, the state of the employee object not correct
 */
public class Employee {
    private int basicSalary;
    private int hourlyRate;

    public Employee(int basicSalary, int hourlyRate){
        setBasicSalary(basicSalary);    // not using this.basicSalary = basicSalary, because we need validation
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours){
        return basicSalary + (extraHours * hourlyRate);
    }

    private void setBasicSalary(int basicSalary){
        if(basicSalary <= 0)
            throw new IllegalArgumentException("Basic Salary cannot be 0 or less");
        this.basicSalary = basicSalary;
    }

    private int getBasicSalary(){
        return this.basicSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }
}
