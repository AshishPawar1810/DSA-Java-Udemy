package LinkedList;

public class MergeTwoSortedLinkedList {

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

   public static Node sortNodes(Node a, Node b){
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        Node head=null; Node tail=null;
        if(a.data<b.data){
            head=tail=a;
            a=a.next;
        }else{
            head=tail=b;
            b=b.next;
        }
        while(a!=null && b!=null){
            if(a.data<b.data){
                tail.next=a;
                tail=a;
                a=a.next;
            }else{
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        if(a==null){
            tail.next=b;
        }else{
            tail.next=b;
        }
        return head;
   }
    public static void main(String[] args) {
        Node head = new Node(100);
        Node sec = new Node(200);
        Node thir = new Node(300);
        Node four = new Node(50);
        Node fif = new Node(150);
        Node six = new Node(250);
        head.next=sec; sec.next=thir;
        four.next=fif; fif.next=six;
        printList(head);
        head=sortNodes(head,four);
        System.out.println();
        printList(head);



    }
}
