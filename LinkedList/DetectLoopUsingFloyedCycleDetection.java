package LinkedList;

public class DetectLoopUsingFloyedCycleDetection {

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

    public static Node reverseLLToK(Node head, int k){
        Node curr=head;
        Node next=null;
        Node prev=null;
        int count =0;
        while(curr!=null && count<k ){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            Node restHead = reverseLLToK(next, k);
            head.next=restHead;
        }
        return prev;
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
        int k=3;
        head=reverseLLToK(head,k);
        System.out.println();
        printList(head);

    }
}
