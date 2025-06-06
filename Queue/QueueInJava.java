package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/*
Queue Interface provided in java
1 LinkedList 2 ArrayDeque
Sturcute is
Collection :
    Queue :
        1 LinkedList
        2 ArrayDeque

 */
public class QueueInJava {

    public static void main(String[] args) {
        Queue<Integer> qu = new ArrayDeque<>();
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
        qu.offer(4);
        System.out.println(qu);
        qu.poll();
        System.out.println(qu.peek());
        System.out.println(qu);

    }
}
