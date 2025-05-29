package LinkedList;

public class PalindromeLinkedList {

    public static class Node{
        char data;
        Node next;

        public Node(char data) {
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

    public static boolean isPalindrome(Node head){
        if(head==null){
            return true;
        }
        Node slow=head; Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node rev=reverseList(slow.next);
        Node curr=head;
        while(rev!=null){
            if(rev.data!=curr.data){
                return false;
            }
            rev=rev.next;
            curr=curr.next;
        }
        return true;
    }

    public static Node reverseList(Node head){
        Node next=null;
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node('R');
        Node sec = new Node('A');
        Node thir = new Node('D');
        Node four = new Node('A');
        Node fif = new Node('R');
        head.next=sec; sec.next=thir; thir.next=four;
        four.next=fif;
        printList(head);
        System.out.println();
        System.out.println("Is palindrome -> "+isPalindrome(head));



    }
}
