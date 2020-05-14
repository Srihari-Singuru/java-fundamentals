package com.srihari.java.advanced.exceptions.custom;

import java.io.IOException;

public class ExceptionsApplication {
    public static void main(String[] args) {
        // Un-checked exception
        ExceptionReplicate.addDeposit(-1);

        // Checked exception
        try {
            ExceptionReplicate.withDrawDeposit(-1);
        } catch (IOException e) {
            System.out.println("Exception in withdrawing deposit amount");
        }

        // Re-throwing exception
        try {
            ExceptionReplicate.payForLoan(-1);
        } catch (IOException e) {
            System.out.println("Exception occurred");
        }

        // Custom exceptions
        try {
            ExceptionReplicate.withDrawFromLoan(101);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
