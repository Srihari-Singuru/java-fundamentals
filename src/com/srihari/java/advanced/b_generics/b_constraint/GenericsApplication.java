package com.srihari.java.advanced.b_generics.b_constraint;

public class GenericsApplication {
    public static void main(String[] args) {
        // Cannot add String, Boolean etc (whose parent is not Number)
        var list = new CustomList<Integer>();
        list.add(1);
        System.out.println(list.get(0));
    }
}
