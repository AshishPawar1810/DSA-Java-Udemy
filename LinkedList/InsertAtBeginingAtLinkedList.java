package LinkedList;

public class InsertAtBeginingAtLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static void printList(Node head){
        Node r = head;
        do{
            System.out.print(r.data+" ");
            r = r.next;
        }while(r!=head);
    }

    public static Node insertAtBeginin(Node head){
        Node temp = new Node(100);
        if(head ==null){
            temp.next=temp;
            return temp;
        }else{
            temp.next=head.next;
            head.next=temp;
            int t = head.data;
            head.data=temp.data;
            temp.data=t;
            return head;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(200);
        Node sec = new Node (300);
        Node thir = new Node(400);
        head.next= sec; sec.next =thir; thir.next=head;
        printList(head);
        head = insertAtBeginin(head);
        System.out.println();
        printList(head);
    }
}
