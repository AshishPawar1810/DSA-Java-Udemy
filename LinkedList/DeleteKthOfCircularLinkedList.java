package LinkedList;

public class DeleteKthOfCircularLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static void printList(Node head){
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }

    public static Node deleteKthNode(Node head, int k){
        if(head==null){
            return head;
        }
        Node curr=head;
        for(int i=0; i<k-2; i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(50);
        Node sec = new Node(500);
        Node thir = new Node(5000);
        head.next=sec; sec.next=thir; thir.next=head;
        printList(head);
        head = deleteKthNode(head, 2);
        System.out.println();
        printList(head);
    }
}
