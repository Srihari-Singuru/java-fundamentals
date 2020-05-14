package com.srihari.java.advanced.generics.simple;

public class GenericsApplication {
    public static void main(String[] args) {
        var list = new CustomList<Integer>();
        list.add(1);
        System.out.println(list.get(0));
    }
}
