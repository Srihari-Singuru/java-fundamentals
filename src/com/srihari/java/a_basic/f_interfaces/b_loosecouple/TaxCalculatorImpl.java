package com.srihari.java.a_basic.f_interfaces.b_loosecouple;

public class TaxCalculatorImpl implements ITaxCalculator {
    private final double taxableIncome;

    public TaxCalculatorImpl(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax(){
        return taxableIncome * 0.3;     // 30% tax
    }
}
