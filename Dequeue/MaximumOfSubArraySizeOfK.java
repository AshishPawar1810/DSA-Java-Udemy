package Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumOfSubArraySizeOfK {

    public static void printkMax(int arr[],int k){
        int n=arr.length;
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0; i<k; i++){
            while(!dq.isEmpty() && arr[i] > arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for(int i=k; i<n; i++){
            System.out.print(arr[dq.peek()]+" ");
            while(!dq.isEmpty() && dq.peek()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[i]>= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()]+" ");
    }

    public static void main(String[] args) {
        int arr[]={20,40,30,10,60};
        int k=3;
        printkMax(arr,k);
    }

}
