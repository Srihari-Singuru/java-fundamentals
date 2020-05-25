package com.srihari.java.b_advanced.c_collections.a_iteration;

public class IteratorApplication {
    public static void main(String[] args) {
        var list = new CustomList<String>();
        list.add("Srihari");
        list.add("Siri");

        // This internally uses Iterator hasNext next etc
        for(var item : list){
            System.out.println(item);
        }
    }
}
