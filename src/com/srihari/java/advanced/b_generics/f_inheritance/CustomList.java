package com.srihari.java.advanced.b_generics.f_inheritance;

// Only int, short etc etc - Number is base class for number types
// <T extends Number>, <T extends Comparable & Cloneable> etc
public class CustomList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
