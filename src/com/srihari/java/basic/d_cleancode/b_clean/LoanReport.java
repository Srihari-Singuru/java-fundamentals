package com.srihari.java.basic.d_cleancode.b_clean;

import java.text.NumberFormat;
import java.util.Locale;

public class LoanReport {
    private final NumberFormat currency;
    private final LoanCalculator loanCalculator;

    public LoanReport(LoanCalculator loanCalculator) {
        this.loanCalculator = loanCalculator;
        currency = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
    }

    public void printLoan() {
        double loan = loanCalculator.calculateLoan();
        String loanFormatted = currency.format(loan);
        System.out.println();
        System.out.println("LOAN");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + loanFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for(var balance : loanCalculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }
}
