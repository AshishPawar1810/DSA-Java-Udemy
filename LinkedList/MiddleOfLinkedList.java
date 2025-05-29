package LinkedList;

public class MiddleOfLinkedList {

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
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void middleOfLinkedList(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("middle node is ->"+slow.data);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node sec = new Node(20);
        Node thir = new Node(30);
        Node four = new Node(40);
        Node fif = new Node(50);
        head.next=sec; sec.next=thir; thir.next=four; four.next=fif;
        printList(head);
        System.out.println();
        middleOfLinkedList(head);

    }
}
