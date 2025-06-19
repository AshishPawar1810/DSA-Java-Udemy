package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTravels {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void printLevel(Node root){
        if(root==null){
            return;
        }
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while(qu.isEmpty()==false){
            Node curr = qu.poll();
            System.out.print(curr.key+" ");
            if(curr.left!=null){
                qu.add(curr.left);
            }
            if(curr.right!=null){
                qu.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(15);
        root.left.left = new Node(30);
        root.right = new Node(20);
        root.right.right = new Node(50);
        root.right.left = new Node(40);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(70);
        printLevel(root);

    }
}
