package com.srihari.java.advanced.collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Doesn't maintain order and removes duplicates
public class SetApplication {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();  // HashSet has multiple constructors where we can even pass a Collection
        Collections.addAll(set, "Srihari", "Siri", "Chinni", "Siri");
        System.out.println(set);

        Set<String> set1 = new HashSet<>(Arrays.asList("a", "c", "b"));
        Set<String> set2 = new HashSet<>(Arrays.asList("c", "d", "a"));

        // Union
        set1.addAll(set2);
        System.out.println(set1);

        // Intersection
        set1.retainAll(set2);
        System.out.println(set1);

        // Difference
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
