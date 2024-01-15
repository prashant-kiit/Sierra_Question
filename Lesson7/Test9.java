package Lesson7;

// https://www.geeksforgeeks.org/difference-between-add-and-offer-methods-in-queue-in-java/

import java.util.PriorityQueue;

class Test9 {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<String>(); // 4
        pq.add("2");
        pq.add("4");

        System.out.print(pq.peek() + " "); // 2
        pq.offer("1"); 
        pq.add("3");
        pq.remove("1");
        System.out.print(pq.poll() + " "); // 2
        if (pq.remove("2")) // false
            System.out.print(pq.poll() + " "); 
        System.out.println(pq.poll() + " " + pq.peek()); // 3 4
    }
}