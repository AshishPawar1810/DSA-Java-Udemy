package LinkedList;

public class DeleteLastOfDoublyLinkedList {

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

    public static Node deletLast(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next!=null   ){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node sec = new Node(20);
        Node thir = new Node(30);
        head.next=sec;
        sec.next=thir;
        thir.prev=sec;
        sec.prev=head;
        printList(head);
        head = deletLast(head);
        System.out.println();
        printList(head);
    }
}
