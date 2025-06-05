package stack;

import java.util.ArrayDeque;
import java.util.Stack;

/*
Span = (Index of current element -  Index of closest element in left side)
if there is greater element at left side
other wise index +1

eg
array   60 10 20 40 35 30 50 70 65
index    0   1  2  3  4  5  6  7  8
span     1   1  2  3  1  1  6  8  7
 */
public class StockSpanProblem {

    public static void printSpan(int arr[]){
        int n=arr.length;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        System.out.print(1+" ");

        for(int i=0; i<n; i++){
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            int span = s.isEmpty() ? i+1: i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[]={60,10,20,15,35,50};
        printSpan(arr);

    }
}
