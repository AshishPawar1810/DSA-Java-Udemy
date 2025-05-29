package LinkedList;

public class DeleteHeadOfCircularLinkedList {

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
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }

    public static Node deleteHead(Node head){
        if(head==null){
            return null;
        }
        if(head.next==head){
            return null;
        }
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(100);
        Node sec = new Node(200);
        Node thir = new Node (300);
        head.next=sec; sec.next=thir; thir.next=head;
        printList(head);
        head = deleteHead(head);
        System.out.println();
        printList(head);

    }
}
