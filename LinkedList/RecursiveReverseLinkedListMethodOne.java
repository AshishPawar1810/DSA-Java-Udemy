package LinkedList;

public class RecursiveReverseLinkedListMethodOne {
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

    public static Node reverseLinkedList(Node head){
        if(head==null){
            return head;
        }
        Node restHead = reverseLinkedList(head.next);
        Node restTail = head.next;
        restTail.next=head;
        head.next=null;
        return restHead;
    }


    public static void main(String[] args) {
        Node head = new Node(1000);
        Node sec = new Node(2000);
        Node thir = new Node(3000);
        Node four = new Node(4000);
        Node fif = new Node(5000);
        head.next=sec; sec.next=thir; thir.next=four; four.next=fif;
        printList(head);
        head=reverseLinkedList(head);
        System.out.println();
        printList(head);

    }

}
