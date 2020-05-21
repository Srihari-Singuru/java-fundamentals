package com.srihari.java.advanced.generics.methodmultiparam;

public class CustomUtil {
    public static <K, V> void printKeyValue(K key, V value) {
        System.out.println("Key: "+key+" ## Value: "+value);
    }
}
