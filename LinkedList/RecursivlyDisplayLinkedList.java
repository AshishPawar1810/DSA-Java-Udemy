package LinkedList;

public class RecursivlyDisplayLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static void printList(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+"-> ");
        printList(head.next);
    }
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
    }
}
