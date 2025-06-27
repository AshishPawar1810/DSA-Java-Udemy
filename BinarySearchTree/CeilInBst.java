package BinarySearchTree;
/*
first greater element than given key.
 */
public class CeilInBst {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static Node ceilInBst(Node root, int x){
        if(root.key==x){
            return root;
        }
        if(root.key<x){
            root =root.right;
        }
        if(root.key>x){
            root= root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        root.right.left.left = new Node(55);
        root.right.left.right = new Node(65);
        ceilInBst(root,58);
    }
}
