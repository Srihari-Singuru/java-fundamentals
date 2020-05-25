package com.srihari.java.basic.b_casestudy.b_beautiful;

public class EmailService implements INotificationService {
    @Override
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
