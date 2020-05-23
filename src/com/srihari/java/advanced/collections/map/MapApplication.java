package com.srihari.java.advanced.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapApplication {
    public static void main(String[] args) {
        var c1 = new Customer("Srihari", "e1");
        var c2 = new Customer("Siri", "e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var customer = map.get("e2");
        System.out.println(customer);

        var unKnown = new Customer("UNKNOWN", "");
        map.get("e5");  // returns NULL
        map.getOrDefault("e5", unKnown);    // returns 'unknown' customer

        map.containsKey("e1");  // returns true or false

        map.replace("e1", new Customer("Praneet", "e1"));   // replaces the value for the key 'e1'
        System.out.println(map);

        // Map by itself i not an Iterable implementation
        for(var key : map.keySet()) {
            System.out.println(key);
        }

        // If we want to get hold of key and value at once
        for(var entry : map.entrySet()) {
            System.out.println(entry.getKey() +" ### "+entry.getValue());
        }

        // Insertion order is not guaranteed
        for(var value : map.values()) {
            System.out.println(value);
        }
    }
}
