package LinkedList;

public class IntersectionPointOfTwoLinkedList {

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

    public static int intersection(Node head, Node head2){
        Node curr1=head; Node curr2=head2;
        while(curr1!=null && curr2!=null){
            if(curr1==curr2){
                return curr1.data;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node sec = new Node(5);
        Node thir = new Node(7);
        Node headSec = new Node(9);
        Node fif = new Node(6);
        Node six = new Node(10);
        head.next=sec; sec.next=thir;  headSec.next=fif; fif.next=six;
        printList(head);
        System.out.println(headSec);
        System.out.println("common intersecion are -> "+intersection(head,headSec));

    }
}
