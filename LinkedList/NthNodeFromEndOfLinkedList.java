package LinkedList;
/*
find element from last to nth position
 */
public class NthNodeFromEndOfLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static void printList(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void printFromLast(Node head, int n){
        if(head==null){
            return;
        }
        Node first=head;
        for(int i=0; i<n; i++){
            if(first==null){
                return;
            }
            first=first.next;
        }
        Node sec=head;
        while(first!=null){
            sec=sec.next;
            first=first.next;
        }
        System.out.println(sec.data);
    }

    public static void main(String[] args) {
        Node head = new Node(1000);
        Node sec = new Node(2000);
        Node thir = new Node(3000);
        Node four = new Node(4000);
        Node fif = new Node(5000);
        head.next=sec; sec.next=thir;
        thir.next=four; four.next=fif;
        printList(head);
        int n=3;
        System.out.println();
        printFromLast(head,n);


    }
}
