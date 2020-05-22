package com.srihari.java.advanced.collections.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionApplication {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //collection.add("a");
        //collection.add("b");
        //collection.add("c");

        // Add all elements at once. COllections is an Util class
        Collections.addAll(collection, "a", "b", "c");
        System.out.println(collection.size());

        collection.remove("a");
        var containsA = collection.contains("a");
        System.out.println(containsA);

        collection.clear();
        var isEmpty = collection.isEmpty();
        System.out.println(isEmpty);

        Object[] objectArray = collection.toArray();
        String[] stringArray = collection.toArray(new String[0]);   // size can be zero, it will automatically set to collection size
        // We can use 'var' in above two statements

        // If we use 'var' here, then the type will be ArrayList but not Collection
        Collection<String> other = new ArrayList<>();
        // Collections.addAll(other, "a", "b", "c");    // collection.equals(other) will be false
        other.addAll(collection);   // collection.equals(other) will be true, but collection == other will be false

        System.out.println(collection == other);
        System.out.println(collection.equals(other));
    }
}
