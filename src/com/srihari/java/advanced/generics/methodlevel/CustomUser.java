package com.srihari.java.advanced.generics.methodlevel;

public class CustomUser implements Comparable<CustomUser> {
    private int userRating;

    public CustomUser(int userRating) {
        this.userRating = userRating;
    }

    @Override
    public int compareTo(CustomUser other) {
        // this < other => -ve
        // this = other => zero
        // this > other => +ve
        return (this.userRating - other.userRating);
    }

    @Override
    public String toString() {
        return "CustomUser{" +
                "userRating=" + userRating +
                '}';
    }
}
