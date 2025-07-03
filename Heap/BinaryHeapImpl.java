package Heap;
/*
Not understood hole chapter
need to revise
 */
public class BinaryHeapImpl {

    public static class minHeap{
        int arr[];
        int capacity;
        int size;

        public minHeap(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            size=0;

        }

        int left(int i){
            return (2*i +1);
        }

        int right(int i){
            return (2*i+2);
        }

        int parent(int i){
            return (i-1)/2;
        }
    }

    public static void main(String[] args) {

    }
}
