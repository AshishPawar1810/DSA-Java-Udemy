package Tree;

public class PrintNodeAtKDistance {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void printKthNode(Node root, int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.print(root.key+" ");
        }else{
            printKthNode(root.left, k-1);
            printKthNode(root.right, k-1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left= new Node(5);
        root.left.left= new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        printKthNode(root,2);
    }
}
