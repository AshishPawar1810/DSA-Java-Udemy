package stack;

import java.util.ArrayDeque;

/*
A tree structure of Stack class
Collection :
    1. List
         Vector
            Stack

Collection
    2. Queue
        Dequeue
            ArrayDeque

Stack class provide tread safty
In single thread safe enviornment use ArrayDeque

 */
public class StackClassInJavaCollection {

    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.push(10);
        ad.push(20);
        ad.push(30);
        System.out.println("Peek -> "+ad.peek());
        System.out.println("Pop "+ad.pop());
        System.out.println("Now peek -> "+ad.peek());
        System.out.println("Size -> "+ad.size());
        System.out.println("IsEmpty -> "+ad.isEmpty());
    }
}
