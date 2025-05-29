package LinkedList;

public class InsertAtEndOfCircularLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static void printList(Node head) {
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }

    public static Node insertAtEnd(Node head){
        Node temp = new Node(400);
        if(head==null){
            temp.next=temp;
            return temp;
        }else{
            Node curr=head;
            while(curr.next!=head){
                curr= curr.next;
            }
            curr.next=temp;
            temp.next=head;
            return head;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(100);
        Node sec = new Node(200);
        Node thir = new Node(300);
        head.next=sec; sec.next=thir; thir.next=head;
        printList(head);
        head=insertAtEnd(head);
        System.out.println( );
        printList(head);
    }
}
