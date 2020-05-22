package com.srihari.java.advanced.exceptions.throwing;

import java.io.IOException;

public class ExceptionReplicate {
    // throwing un-checked exception
    public static void addDeposit(int value) {
        if(value <= 0)
            throw new IllegalArgumentException();
    }

    // throwing checked exception - forces us to use throws clause
    public static void withDrawDeposit(int value) throws IOException{
        if(value <= 0)
            throw new IOException();
    }

    // re-throwing an exception - forces caller to handle it
    public static void payForLoan(int value) throws IOException {
        try {
            payForAccount(value);
        } catch (IOException ex) {
            System.out.println("Exception caught");
            throw ex;
        }
    }
    private static void payForAccount(int value) throws IOException {
        if(value <= 0)
            throw new IOException();
    }
}