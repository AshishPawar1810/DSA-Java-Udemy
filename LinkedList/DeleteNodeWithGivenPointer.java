package LinkedList;
//not working
public class DeleteNodeWithGivenPointer {

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

    public static Node deleteNode(Node head, int k){
        Node curr = head;
        if(curr.data==k){
            curr.data=curr.next.data;
            curr.next=curr.next.next;
        }
        return curr;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node sec = new Node(20);
        Node thir = new Node(30);
        Node four = new Node(40);
        Node fif = new Node(50);
        Node six = new Node(60);
        head.next=sec; sec.next=thir; thir.next=four; four.next=fif; fif.next=six;
        printList(head);
        int k=30;
        head=deleteNode(head,k);
        System.out.println();
        printList(head);

    }
}
