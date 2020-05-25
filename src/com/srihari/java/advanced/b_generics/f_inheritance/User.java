package com.srihari.java.advanced.b_generics.f_inheritance;

public class User implements Comparable<User> {
    private final int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        // this < other => -ve
        // this = other => zero
        // this > other => +ve
        return (this.points - other.points);
    }

    @Override
    public String toString() {
        return "CustomUser{" +
                "userRating=" + points +
                '}';
    }
}
