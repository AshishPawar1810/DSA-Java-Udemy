package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftViewOfBinaryTree {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

   public static void printLeftView(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            int count =q.size();
            for(int i=0; i<count; i++){
                Node curr =q.poll();
                if(i==0){
                    System.out.print(curr.key+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
   }

    public static void main(String[] args) {
            Node root = new Node(10);
            root.left = new Node(20);
            root.right = new Node(30);
            root.right.left = new Node(40);
            root.right.right = new Node(50);
            printLeftView(root);
    }
}
