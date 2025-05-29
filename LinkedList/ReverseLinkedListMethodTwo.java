package LinkedList;

public class ReverseLinkedListMethodTwo {

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


    public static Node rev(Node curr,Node prev){
        if(curr==null){
            return prev;
        }
        Node next= curr.next;
        curr.next=prev;
        return rev(next,curr);
    }

    public static void main(String[] args) {
        Node head = new Node(1000);
        Node sec = new Node(2000);
        Node thir = new Node(3000);
        Node four = new Node(4000);
        Node fif = new Node(5000);
        head.next=sec; sec.next=thir; thir.next=four; four.next=fif;
        printList(head);
        head=rev(head,fif);
        System.out.println();
        printList(head);

    }
}
