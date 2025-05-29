package LinkedList;

public class SeregateEvenOddNodes {

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

    public static Node segrate(Node head){
        Node es=null;
        Node ee=null;
        Node os=null;
        Node oe=null;

        for(Node curr=head; curr!=null; curr=curr.next){
            int x=curr.data;
            if(x%2==0) {
                if (es == null) {
                    es = ee = curr;
                } else {
                    ee.next = curr;
                    ee = ee.next;
                }
            }else{
                if(os==null){
                    os=oe=curr;
                }else{
                    oe.next=curr;
                    oe=oe.next;
                }
            }
        }
        if(os!=null || es==null){
            return head;
        }
        ee.next=os;
        oe.next=null;
        return es;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node sec = new Node(5);
        Node thir = new Node(7);
        Node four = new Node(9);
        Node fif = new Node(6);
        Node six = new Node(20);
        head.next=sec; sec.next=thir; thir.next=four; four.next=fif; fif.next=six;
        printList(head);
        int k=30;
        head=segrate(head);
        System.out.println();
        printList(head);

    }

}
