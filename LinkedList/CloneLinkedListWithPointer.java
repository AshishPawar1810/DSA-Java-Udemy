package LinkedList;

import java.util.HashMap;

public class CloneLinkedListWithPointer {

    public static class Node{
        public Node random;
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

    public static Node cloneLinkedList(Node h1){
        Node curr=h1;
        while(curr!=null){
            Node next=curr.next;
            curr.next=new Node(curr.data);
            curr.next.next=next;
            curr=next;
        }

        for(curr=h1; curr!=null; curr=curr.next.next){
            curr.next.random=(curr.random==null)?null : curr.random.next;
        }

        Node h2 =h1.next;
        Node clone=h2;

        for(curr=h1; curr!=null; curr=curr.next){
            curr.next=curr.next.next;
           // clone.next=clone.next?clone.next.next:null;
            clone=clone.next;
        }
        return h2;
    }

    public static Node cloneMethodTwo(Node head){
        HashMap<Node, Node> map = new HashMap<>();
        Node curr=head;
        for(curr=head; curr!=null; curr=curr.next){
            map.put(curr, new Node(curr.data));
        }
        for(curr=head; curr!=null; curr=curr.next){
            Node clone = map.get(curr);
            clone.next=map.get(curr.next);
            clone.random=map.get(curr.random);
        }
        return map.get(curr);
    }
    public static void main(String[] args) {
        Node head = new Node(100);
        Node sec = new Node(200);
        Node thir = new Node(300);
        Node four = new Node(400);
        Node fif = new Node(500);
        Node six = new Node(600);
        head.next=sec; sec.next=thir; thir.next=four; four.next=fif; fif.next=six;
        printList(head);
        head=cloneLinkedList(head);
        System.out.println();
        printList(head);



    }
}
