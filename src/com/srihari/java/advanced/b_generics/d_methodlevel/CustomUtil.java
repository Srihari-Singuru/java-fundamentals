package com.srihari.java.advanced.b_generics.d_methodlevel;

public class CustomUtil {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) > 0 ? first : second;
    }
}
