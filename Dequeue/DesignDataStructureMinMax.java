package Dequeue;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DesignDataStructureMinMax {

    public static class MyDeque{
        Deque<Integer> dq;

        public MyDeque() {
            dq= new LinkedList<Integer>();
        }

        void insertMin(int x){
            dq.offerFirst(x);
        }

        void insertMax(int x){
            dq.offerLast(x);
        }

        int getMin(){
            return dq.peekFirst();
        }

        int getMax(){
            return dq.peekLast();
        }
    }

    public static void main(String[] args) {
        MyDeque mdq = new MyDeque();
        mdq.insertMin(0);
        mdq.insertMax(9);
        System.out.println(" Min => "+mdq.getMin());
        System.out.println("Max => "+mdq.getMax());
    }
}
