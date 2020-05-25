package com.srihari.java.advanced.c_collections.c_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListApplication {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // Add an item at a given index
        list.add(0, "!");
        Collections.addAll(list, "a", "b", "c");
        System.out.println(list);

        var first = list.get(0);
        System.out.println(first);

        list.set(0, "!!");  // Replaces the element at the index
        first = list.get(0);
        System.out.println(first);

        list.remove(0);
        System.out.println(list);

        list.add("a");
        var index = list.indexOf("a");  // first index
        System.out.println(index);
        var lastIndex = list.lastIndexOf("a");  // last index
        System.out.println(lastIndex);

        System.out.println(list.subList(0, 2)); // from included, to excluded; return new list hence existing list is not modified
    }
}
