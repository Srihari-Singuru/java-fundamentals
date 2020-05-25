package com.srihari.java.b_advanced.a_exceptions.f_chaining;

public class AccountException extends Exception{
    public AccountException(Exception cause) {
        super(cause);
    }
}
