package com.srihari.java.basic.paradigm.oop.abstraction;

/**
 * This class depicts the abstraction
 * which is hiding the unnecessary details (implementation details)
 *
 * If implementation changes, then caller will not be impacted
 * Also, caller will not be able to access these implementation methods
 */

public class Browser {

    /** Caller will have access to only this method */
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    /* If this implementation changes in the future (Ex: adding extra parameter),
       the caller will not be impacted */
    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}
