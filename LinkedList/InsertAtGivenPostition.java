package LinkedList;

public class InsertAtGivenPostition {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(60);
        printList(head);
        int data =50; int pos =4;
        head =insertAtPostion(head, pos,data);
        System.out.println();
        printList(head);
    }

    public static void printList(Node node){
        if(node ==null){
            return;
        }
        System.out.print(node.data+" ");
        printList(node.next);
    }

    public static Node insertAtPostion(Node head,int pos, int x){
        Node temp = new Node(x);
        if(pos ==4){
            temp.next=head;
            return temp;
        }
        Node curr = head;
        for(int i=1; i<pos && curr!=null; i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }

        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
}
