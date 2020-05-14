package com.srihari.java.advanced.generics.methodlevel;

public class CustomUtil {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) > 0 ? first : second;
    }
}
