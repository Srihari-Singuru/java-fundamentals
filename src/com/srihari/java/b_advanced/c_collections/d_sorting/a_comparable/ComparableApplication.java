package com.srihari.java.b_advanced.c_collections.d_sorting.a_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableApplication {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        Collections.addAll(list, new Customer("Srihari"), new Customer("Siri"), new Customer("Chinni"));

        Collections.sort(list); // It uses Comparable interface to sort
        System.out.println(list);
    }
}
