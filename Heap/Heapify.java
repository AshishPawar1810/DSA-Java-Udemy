package Heap;

public class Heapify {

    public static class minHeap{
        int arr[];
        int capacity;
        int size;

        int left(int i){
            return (2*i +1);
        }

        int right(int i){
            return (2*i+2);
        }

        int parent(int i){
            return (i-1)/2;
        }

        public minHeap(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            size=0;
        }

        public  int extractMin()  {
            int INT = Integer.MAX_VALUE;
            if(size==0){
                return INT;
            }
            if(size==1){
                size--;
                return arr[0];
            }

            int temp = arr[0];
            arr[0]= arr[size-1];
            arr[size-1]= temp;
            return arr[size];
        }
    }

    public static void main(String[] args) {

    }
}
