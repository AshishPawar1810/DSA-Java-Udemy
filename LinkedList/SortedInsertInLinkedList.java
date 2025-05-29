package LinkedList;

public class SortedInsertInLinkedList {

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

    public static Node insertAtSorted(Node head, int x){
        Node temp = new Node(x);
        if(head==null){
            return head;
        }
        if(x<head.data){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while(curr.next!=null && curr.next.data<x){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

    public static void main(String[] args) {
        Node head= new Node(10);
        Node sec = new Node(20);
        Node thir = new Node(30);
        head.next=sec; sec.next=thir;
        printList(head);
        int x=25;
        head=insertAtSorted(head, x);
        System.out.println();
        printList(head);

    }
}
