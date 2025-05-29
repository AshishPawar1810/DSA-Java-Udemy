package LinkedList;

public class CircularDoublyLinkedList {

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
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }

    public static Node insertAtBegin(Node head){
        Node temp= new Node(5);
        if(head==null){
            temp.next=head;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;
    }

    public static void main(String[] args) {
        Node head= new Node(10);
        Node sec = new Node(15);
        Node thir = new Node(20);
        head.next=sec; head.prev=thir;
        sec.next=thir; sec.prev=head;
        thir.next=head; thir.prev=sec;
        printList(head);
        head = insertAtBegin(head);
        System.out.println();
        printList(head);
    }
}
