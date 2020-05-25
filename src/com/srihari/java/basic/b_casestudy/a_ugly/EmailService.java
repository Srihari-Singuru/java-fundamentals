package com.srihari.java.basic.b_casestudy.a_ugly;

public class EmailService {
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
