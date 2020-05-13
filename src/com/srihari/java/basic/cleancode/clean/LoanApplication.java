package com.srihari.java.basic.cleancode.clean;

/**
 * This code is clean and uses Object Oriented principals
 */

public class LoanApplication {

    public static void main(String[] args) {
        int principal = (int) CustomConsole.readNumber("Principal: ", 1000, 10_00_000);
        float annualInterest = (float) CustomConsole.readNumber("Annual Interest Rate: ", 1, 15);
        byte years = (byte) CustomConsole.readNumber("Period (Years): ", 1, 30);

        var loanCalculator = new LoanCalculator(principal, annualInterest, years);
        var loanReport = new LoanReport(loanCalculator);

        loanReport.printLoan();
        loanReport.printPaymentSchedule();
    }

}
