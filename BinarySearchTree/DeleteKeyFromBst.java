package BinarySearchTree;

public class DeleteKeyFromBst {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static Node getSucc(Node root){
        Node curr =root.right;
        while (curr!=null && curr.left!=null){
            curr=curr.left;
        }
        return curr;
    }

    public static Node deleteNode(Node root, int x){
        if(root==null){
            return null;
        }
        if(root.key>x){
            root.left=deleteNode(root.left,x);
        }else if(root.key<x){
            root.right=deleteNode(root.right,x);
        }else{
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                Node succ = getSucc(root);
                root.key=succ.key;
                root.right= deleteNode(root.right,succ.key);
            }
        }
        return root;

    }

    public static void inorderTraversal(Node root){
        if(root!=null){
            inorderTraversal(root.left);
            System.out.print(root.key+" ");
            inorderTraversal(root.right);
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
        inorderTraversal(root);
        System.out.println( );
        deleteNode(root, 3);
        inorderTraversal(root);
    }
}
