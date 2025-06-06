package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void reverseQueu(Queue<Integer> qu){
        if(qu.isEmpty()){
            return;
        }
        int x =qu.poll();
        reverseQueu(qu);
        qu.add(x);
    }

    public static void main(String[] args) {
        Queue<Integer> qu = new ArrayDeque<>();
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
        qu.offer(4);
        qu.offer(5);
        System.out.println(qu);
        reverseQueu(qu);
        System.out.println(qu);
    }
}
