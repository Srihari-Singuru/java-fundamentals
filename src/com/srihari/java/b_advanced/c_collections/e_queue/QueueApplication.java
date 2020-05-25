package com.srihari.java.b_advanced.c_collections.e_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueApplication {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Srihari");
        queue.add("Siri");
        queue.add("Chinni");

        // both add and offer will work in ArrayDeque as there is no specific limit for ArrayDeque
        queue.offer("Praneet"); // Same as 'add', but add throws exception if queue is full
        System.out.println(queue);

        queue.peek();   // returns null if queue is empty
        queue.element();    // throws exception if queue is empty

        queue.poll();   // returns null if queue is empty
        queue.remove(); // throws exception if queue is empty
    }
}
