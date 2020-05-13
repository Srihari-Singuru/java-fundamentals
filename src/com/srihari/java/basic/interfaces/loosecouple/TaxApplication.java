package com.srihari.java.basic.interfaces.loosecouple;

public class TaxApplication {
    public static void main(String[] args) {
        var calculator = new TaxCalculatorImpl(1_00_000);
        var report = new TaxReport(calculator);

        report.show();
    }
}
