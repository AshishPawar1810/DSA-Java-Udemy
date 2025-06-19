package Tree;
/*
Height of binary tree means
total length of max connected node
we can also count the edges
 */
public class HeightOfBinaryTree {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static int heightOfBinary(Node root){
        if(root ==null){
            return 0;
        }
        else{
            return Math.max((heightOfBinary(root.left)), heightOfBinary(root.right)+1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left= new Node(5);
        root.right = new Node(20);
        root.right.right = new Node(30);
        root.right.right.right = new Node(40);
        root.right.right.right.right =new Node(50);
        System.out.println("Height of tree -> "+heightOfBinary(root));
    }

}
