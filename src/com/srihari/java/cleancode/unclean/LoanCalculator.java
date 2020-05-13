package com.srihari.java.cleancode.unclean;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * The following code is very procedural
 */
public class LoanCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 10_00_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 15);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        printLoan(principal, annualInterest, years);
        printPaymentSchedule(principal, annualInterest, years);
    }

    private static void printLoan(int principal, float annualInterest, byte years) {
        double loan = calculateLoan(principal, annualInterest, years);
        String loanFormatted = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(loan);
        System.out.println();
        System.out.println("LOAN");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + loanFormatted);
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade
    ) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public static double calculateLoan(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double loan = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return loan;
    }
}
