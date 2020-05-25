package com.srihari.java.advanced.a_exceptions.e_custom;

import java.io.IOException;

public class ExceptionReplicate {
    private static int balance = 100;

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

    // custom exceptions
    public static void withDrawFromLoan(int value) throws InsufficientFundsException {
        try {
            withdrawFromAccount(value);
        } catch (InsufficientFundsException ex) {
            System.out.println("Exception caught");
            throw ex;
        }
    }
    private static void withdrawFromAccount(int value) throws InsufficientFundsException {
        if(value > balance)
            throw new InsufficientFundsException();
    }

}
