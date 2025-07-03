package Heap;

import java.util.Collections;

public class PriorityQueue {

    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(15);
        System.out.println("peek -> "+pq.peek());
        System.out.println("poll -> "+pq.poll());


    }
}
