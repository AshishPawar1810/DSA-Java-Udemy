package LinkedList;

public class InsertAtEndDoublyLinkedList {

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

    public static void printList(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        printList(head.next);
    }

    public static Node insertAtEnd(Node head){
        Node temp = new Node(50);
        if(head==null){
            return temp;
        }
        Node curr=head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node one = new Node(20);
        Node sec = new Node(30);
        Node thir = new Node(40);
        head.next = one;
        one.next = sec;
        sec.next = thir;
        thir.prev = sec;
        sec.prev = one;
        one.prev = head;
        printList(head);
        head = insertAtEnd(head);
        System.out.println();
        printList(head);
    }
}
