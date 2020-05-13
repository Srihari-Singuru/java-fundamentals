package com.srihari.java.interfaces.loosecouple;

public class TaxReport {

    private final ITaxCalculator calculator;

    // Constructor Injection
    public TaxReport(final ITaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
