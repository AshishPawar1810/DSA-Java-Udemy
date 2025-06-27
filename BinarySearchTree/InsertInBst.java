package BinarySearchTree;

import Tree.ImplOfInorderTraversal;

public class InsertInBst {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static Node insertInBst(Node root, int x){
        if(root==null){
            return new Node(x);
        }
        if(root.key>x){
            root.left = insertInBst(root.left, x);
        }else{
            root.right = insertInBst(root.right,x);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.key+" ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right  = new Node(80);
        inOrder(root);
        insertInBst(root,1);
        System.out.println();
        inOrder(root);

    }
}
