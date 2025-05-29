package LinkedList;
/*
DoblyLinkedList Advantages:
can travrse in both directions
a given in delete O(1) time
Insert/delete before node

Disadvantages:
Extra space for previous
code become to complex
 */
public class DoublyLinkedList {

    public static class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            prev=null;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node sec = new Node(20);
        Node thr = new Node(30);
        head.next=sec;
        sec.prev=head;
        sec.next=thr;
        thr.prev=sec;
    }
}
