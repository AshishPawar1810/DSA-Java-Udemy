package LinkedList;

public class RemoveDuplicateInLinkedList {

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


   public static void removeDupli(Node head){
        Node curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
   }

    public static void main(String[] args) {
        Node head = new Node(1000);
        Node sec = new Node(1000);
        Node thir = new Node(1000);
        Node four = new Node(2000);
        Node fif = new Node(2000);
        head.next=sec; sec.next=thir; thir.next=four; four.next=fif;
        printList(head);
        removeDupli(head);
        System.out.println();
        printList(head);

    }
}
