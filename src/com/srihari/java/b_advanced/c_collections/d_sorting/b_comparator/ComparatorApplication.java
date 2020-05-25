package com.srihari.java.b_advanced.c_collections.d_sorting.b_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorApplication {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        Collections.addAll(list, new Customer("Srihari", "email2"), new Customer("Siri", "email1"), new Customer("Chinni", "email3"));

        Collections.sort(list, new NameComparator()); // We can have sorting with any field based on Comparator
        System.out.println(list);

        Collections.sort(list, new EmailComparator());
        System.out.println(list);
    }
}
