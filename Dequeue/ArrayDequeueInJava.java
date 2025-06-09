package Dequeue;

import java.util.ArrayDeque;

/*
Collection -> Queue -> Deque -> ArrayDequeue
Array deque is faster than Linked list
Also can be used to implement Stack and Queue data structrue
Six function in ArrayDequeue
add()   offer()//add element after front
remove() poll()//remove element from last rear
element()   peek()
function that               Function that don't
throws exception            throw exception
if null in deque
addFirst()                  offerFirst()
addLast()                   offerLast()
removeFirst()               pollFirst()
removeLast()                peekFirst()
getFirst()                  peekLast()
getLast()

stack function are
push()      pop()       addFirst()      removeLast()


 */
public class ArrayDequeueInJava {

    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(10);
        ad.offer(20);
        System.out.println(ad);
        ad.offerFirst(5);
        System.out.println("peek -> "+ad.peek());
        ad.poll();
        ad.offerLast(40);
        System.out.println(ad);
        System.out.println(ad.peekFirst()+" "+ad.peekLast());

    }
}
