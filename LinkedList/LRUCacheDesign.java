package LinkedList;
/*
Lease Recently Use cache memory
very fast for cache impl
Recently used data come first in linked list
When linked list get full we remove last item if size get full
Not impl in video
 */
public class LRUCacheDesign {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static void printList(Node head  ){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static Node swapPair(Node head){
        Node curr=head;
        while(curr!=null && curr.next!=null){
            int temp=curr.data;
            curr.data=curr.next.data;
            curr.next.data=temp;
            curr=curr.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(100);
        Node sec = new Node(200);
        Node thir = new Node(300);
        Node four = new Node(400);
        Node fif = new Node(500);
        Node six = new Node(600);
        head.next=sec; sec.next=thir; thir.next=four; four.next=fif; fif.next=six;
        printList(head);
        head=swapPair(head);
        System.out.println();
        printList(head);



    }
}
