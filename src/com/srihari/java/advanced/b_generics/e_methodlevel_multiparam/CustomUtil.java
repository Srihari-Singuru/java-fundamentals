package com.srihari.java.advanced.b_generics.e_methodlevel_multiparam;

public class CustomUtil {
    public static <K, V> void printKeyValue(K key, V value) {
        System.out.println("Key: "+key+" ## Value: "+value);
    }
}
