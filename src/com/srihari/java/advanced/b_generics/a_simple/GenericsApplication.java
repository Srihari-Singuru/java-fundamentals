package com.srihari.java.advanced.b_generics.a_simple;

public class GenericsApplication {
    public static void main(String[] args) {
        var list = new CustomList<Integer>();
        list.add(1);
        System.out.println(list.get(0));
    }
}
