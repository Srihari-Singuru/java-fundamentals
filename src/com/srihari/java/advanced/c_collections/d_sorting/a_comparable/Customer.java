package com.srihari.java.advanced.c_collections.d_sorting.a_comparable;

public class Customer implements Comparable<Customer> {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
