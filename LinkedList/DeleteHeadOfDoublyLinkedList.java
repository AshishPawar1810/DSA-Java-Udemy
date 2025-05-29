package LinkedList;

public class DeleteHeadOfDoublyLinkedList {

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
            return ;
        }
        System.out.print(head.data+" ");
        printList(head.next);
    }

   public static Node delFirst(Node head){
        if(head==null || head.next==null){
            return head;
        }
        head=head.next;
        head.prev=null;
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
        head = delFirst(head);
        System.out.println();
        printList(head);
    }
}
