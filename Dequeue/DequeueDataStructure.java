package Dequeue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/*
Dequeue stand for doubly ended queue
Insert and delete from both end front and rear
Application of Deque:
Can be used as both stack and queue
Maintian history of brwoser
Process scheduling algoritham
Impl pirority with two type of priority

 */
public class DequeueDataStructure {

    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerLast(50);
        dq.addFirst(60);
        dq.addLast(70);
        System.out.println(dq);
        System.out.println("First peek -> "+dq.peekFirst());
        System.out.println("Last peek -> "+dq.peekLast());
        System.out.println("Poll first ->"+dq.pollFirst());
        System.out.println("Poll Last -> "+dq.pollLast());
        System.out.println(dq);

        Iterator it = dq.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
