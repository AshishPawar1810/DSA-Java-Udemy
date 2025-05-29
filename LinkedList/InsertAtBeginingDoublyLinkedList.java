package LinkedList;

public class InsertAtBeginingDoublyLinkedList {

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

    private static void printList(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        printList(head.next);
    }

    public static Node insertAtBeginin(Node head){
        Node temp = new Node(5);
        temp.next=head;
        if(head!=null){
            head.prev=temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        temp2.prev=temp1;
        temp1.prev=head;
        printList(head);
        head=insertAtBeginin(head);
        System.out.println();
        printList(head);
    }
}
