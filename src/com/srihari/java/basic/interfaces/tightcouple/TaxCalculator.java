package com.srihari.java.basic.interfaces.tightcouple;

public class TaxCalculator {
    private final double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax(){
        return taxableIncome * 0.3;     // 30% tax
    }
}
