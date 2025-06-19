package Tree;

import java.util.Stack;

public class ItrativePreorderTraversal {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void itrativePreorder(Node root){
        if(root==null){
            return;
        }
        Stack<Node> s = new Stack<>();
        Node curr=root;
        while (curr!=null || s.isEmpty()==false){
            while ((curr!=null)){
                System.out.print(curr.key+" ");
                if(curr.right!=null){
                    s.push(curr.right);
                }
                curr=curr.left;
            }
            if(s.isEmpty()==false){
                curr=s.pop();
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        itrativePreorder(root);
    }
}
