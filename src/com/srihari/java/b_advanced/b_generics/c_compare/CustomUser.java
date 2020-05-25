package com.srihari.java.b_advanced.b_generics.c_compare;

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
}
