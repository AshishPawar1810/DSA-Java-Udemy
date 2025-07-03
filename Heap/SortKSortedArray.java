package Heap;

import java.util.PriorityQueue;

public class SortKSortedArray {

    public static void kSorted(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<=k; i++){
            pq.add(arr[i]);
        }
        for(int i=k+1; i<arr.length; i++){
            arr[i++]=pq.poll();
            pq.add(arr[i]);
        }
        while(pq.isEmpty()==false){
            int index =0;
            arr[index++]=pq.poll();
        }
        System.out.println(pq);
    }

    public static void main(String[] args) {
        int arr[]= {9,8,7,19,18};
        kSorted(arr,2);

    }
}
