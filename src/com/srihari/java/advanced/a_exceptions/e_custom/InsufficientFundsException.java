package com.srihari.java.advanced.a_exceptions.e_custom;

/**
 * For checked -> extends Exception
 * For un-checked -> extends RuntimeException
 */

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("Insufficient funds in your account");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
