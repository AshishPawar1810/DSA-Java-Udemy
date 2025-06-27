package BinarySearchTree;

public class SearchInBst {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static boolean isPresent(Node root, int x){
        if(root==null){
            return false;
        }
        while(root!=null){
            if(root.key==x){
                return true;
            }else if(root.key<x){
                root=root.right;
            }else {
                root=root.left;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right  = new Node(80);
        System.out.println("Is node present -> "+isPresent(root,16));
    }
}
