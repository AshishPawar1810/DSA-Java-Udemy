package BinarySearchTree;

public class FixBSTWithTwoNodeSwapped {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void fixBst(Node root){
        Node prev = null;
        Node first = null;
        Node sec = null;

        if(root==null){
            return;
        }
        if(prev!=null && root.key <= prev.key){
            if(first==null){
                first=prev;
            }
            sec= root;
        }
        prev=root;
        fixBst(root.right);
    }

    public static void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.key+" ");
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(18);
        root.left = new Node(60);
        root.left.left = new Node(4);
        root.right = new Node(70);
        root.right.right = new Node(80);
        root.right.left = new Node(8);
        fixBst(root);
        inOrderTraversal(root);


    }
}
