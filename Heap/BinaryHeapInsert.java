package Heap;

public class BinaryHeapInsert {

    public static class BinaryHead{
        int arr[];
        int c;
        int size;

        public BinaryHead(int c) {
            this.c = c;
            size=0;
            arr= new int[c];
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

        void insert(int x){
            if(size==c){
                return;
            }
            for(int i=size-1; i!=0 && arr[parent(i)]>arr[i]; i++){
                int temp = arr[i];
                arr[i] = arr[parent(i)];
                arr[parent(i)] =temp;
                i=parent(i);
            }
        }
    }

    public static void main(String[] args) {

    }
}
