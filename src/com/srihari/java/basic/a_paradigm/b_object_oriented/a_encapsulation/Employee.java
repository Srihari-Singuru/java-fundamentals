package com.srihari.java.basic.a_paradigm.b_object_oriented.a_encapsulation;

/**
 * We are encapsulating the Employee related items here
 * and assuming basic salary is fixed for a year (not a frequent change)
 * and assuming hourly rate is fixed for a year (not a frequent change)
 * but extra hours may change every month
 */
public class Employee {
    private int basicSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours){
        return basicSalary + (extraHours * hourlyRate);
    }

    /* Can do any kind of validations since it is at blueprint level
       It is not efficient to do the same validations while setting the values at object level */
    public void setBasicSalary(int basicSalary){
        if(basicSalary <= 0)
            throw new IllegalArgumentException("Basic Salary cannot be 0 or less");
        this.basicSalary = basicSalary;
    }

    public int getBasicSalary(){
        return this.basicSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }
}
