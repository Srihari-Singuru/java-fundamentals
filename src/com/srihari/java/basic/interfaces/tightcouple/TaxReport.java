package com.srihari.java.basic.interfaces.tightcouple;

public class TaxReport {

    /* Tightly coupled with TaxCalculator
       if constructor changes, all the dependents need to be changed
       or if implementation changes, then all the dependents need to be re-compiled etc. */
    private final TaxCalculator calculator;

    public TaxReport() {
        calculator = new TaxCalculator(1_00_000);
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
