package Queue;

public class ImplOfQueueUsingArray {

    public static class Queue{
        int size;
        int capacity;
        int [] arr;
        int front=arr[0];
        int rear=size-1;

        public Queue(int capacity) {
            this.capacity = capacity;
            size=0;
            arr=new int[capacity];
        }

        boolean isFull(){
            return capacity==size;
        }

        boolean isEmpty(){
            return size==0;
        }

        int getFront(){
            if(isEmpty()){
                return -1;
            }else{
                return front;
            }
        }

        int getRear(){
            if(isEmpty())
                return -1;
            else
                return (front+size-1)%capacity;
        }
    }
}
