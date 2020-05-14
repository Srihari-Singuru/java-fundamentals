package com.srihari.java.advanced.exceptions.chaining;

public class AccountException extends Exception{
    public AccountException(Exception cause) {
        super(cause);
    }
}
