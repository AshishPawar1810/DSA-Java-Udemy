package LinkedList;

public class CircularLinkedListTravelse {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static void printList(Node head){
        Node r= head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node sec = new Node(20);
        Node thir = new Node(30);
        head.next=sec;
        sec.next=thir;
        thir.next=head;
        printList(head);
    }
}
