package com.srihari.java.advanced.exceptions.custom;

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
