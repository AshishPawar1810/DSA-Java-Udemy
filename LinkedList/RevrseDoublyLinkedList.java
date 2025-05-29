package LinkedList;

public class RevrseDoublyLinkedList {

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

    public static Node reverseList(Node head){
        if(head ==null || head.next==null){
            return head;
        }

        Node prev =null;
        Node curr= head;
        while(curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node sec = new Node(20);
        Node thir = new Node(30);
        Node four = new Node(40);
        Node fifth = new Node(50);
        head.next = sec;
        sec.next = thir;
        thir.next = four;
        four.next = fifth;
        fifth.prev = four;
        four.prev = thir;
        thir.prev = sec;
        sec.prev = head;
        printList(head);
        System.out.println();
        head = reverseList(head);
        printList(head);
    }
}
