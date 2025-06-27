package BinarySearchTree;

public class CheckForBST {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static boolean isBinaryTree(Node root){
        int prev = Integer.MIN_VALUE;
        if(root==null){
            return true;
        }
        if(isBinaryTree(root.left)==false){
            return false;
        }
        if(root.key<=prev){
            return false;
        }
        prev=root.key;
        return isBinaryTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(18);
        root.right.right = new Node(35);
        System.out.println("Is Binary tree -> "+isBinaryTree(root));


    }
}
