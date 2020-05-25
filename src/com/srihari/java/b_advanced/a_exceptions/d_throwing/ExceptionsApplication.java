package com.srihari.java.b_advanced.a_exceptions.d_throwing;

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
    }
}
