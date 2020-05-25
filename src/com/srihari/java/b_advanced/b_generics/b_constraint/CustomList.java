package com.srihari.java.b_advanced.b_generics.b_constraint;

// Only int, short etc etc - Number is base class for number types
// <T extends Number>, <T extends Comparable & Cloneable> etc
public class CustomList<T extends Number> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
