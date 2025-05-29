package LinkedList;

public class SearchInSinglyLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static int searchEle(Node head, int x){
        int pos=1;
        Node curr = head;
        while(curr != null){
            if(curr.data ==x){
                return pos;
            }else{
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        int x=30;
        System.out.println("element at pos ->"+searchEle(head,x));
    }
}
