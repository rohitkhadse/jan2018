package com.datastructure;

import java.util.PriorityQueue;

public class QueueImplementation {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Amit");
        priorityQueue.add("Vijay");
        priorityQueue.add("Karan");
        priorityQueue.add("Jay");
        priorityQueue.add("Rahul");

        System.out.println("head: "+priorityQueue.element());
        System.out.println("head: "+priorityQueue.peek());

        System.out.println("---Iterating the queue---");
        for (String s : priorityQueue){
            System.out.println(s);
        }

        priorityQueue.remove();

        System.out.println("head: "+priorityQueue.peek());
        priorityQueue.poll();

        System.out.println("---After removing 2 elements---");
        for (String s : priorityQueue){
            System.out.println(s);
        }

    }
}
