package LinkedList;

public class InsertAtBeginingOfSingleLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static Node insertSingly(Node head,int x){
        Node temp = new Node(x);
        temp.next=head;
        return temp;

    }

    public static void printList(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        printList(node.next);
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertSingly(head, 30);
        head = insertSingly(head, 20);
        head = insertSingly(head, 10);
        printList(head);
    }
}
