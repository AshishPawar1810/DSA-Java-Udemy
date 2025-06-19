package Tree;

import java.util.Stack;

public class ItrativeInorderTraversal {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void itrativeInorder(Node root){
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(curr!=null || st.isEmpty()==false){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr= st.pop();
            System.out.print(curr.key+" ");
            curr=curr.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        itrativeInorder(root);
    }
}
