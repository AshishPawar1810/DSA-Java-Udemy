package LinkedList;

public class DeleteLastNodeSinglyLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
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

    public static Node deleteLastNode(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node curr= head;
        while(curr.next.next !=null){
            curr = curr.next;
        }
        curr.next=null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printList(head);
        head= deleteLastNode(head);
        System.out.println(     );
        printList(head);
    }
}
