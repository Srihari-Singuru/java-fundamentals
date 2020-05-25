package com.srihari.java.advanced.a_exceptions.f_chaining;

public class AccountException extends Exception{
    public AccountException(Exception cause) {
        super(cause);
    }
}
