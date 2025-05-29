package LinkedList;

public class InsertAtEndOfSinglyLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static Node insertAtEnd(Node head, int x){
        Node temp = new Node(x);
        if(head==null){
            return temp;
        }
        Node curr = head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }

    public static void printList(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        printList(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        insertAtEnd(head,40);
        printList(head);
    }
}
