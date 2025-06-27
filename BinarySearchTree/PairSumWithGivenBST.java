package BinarySearchTree;

import java.util.HashSet;

public class PairSumWithGivenBST {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static boolean isPair(Node root, int sum, HashSet<Integer> hs){
        if(root==null){
            return false;
        }
        if(isPair(root.left,sum, hs)==true){
            return true;
        }
        if(hs.contains(sum-root.key)){
            return true;
        }else {
            hs.add(root.key);
        }
        return isPair(root.right,sum,hs);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.right = new Node(40);
        root.right.left = new Node(16);
        HashSet<Integer> hs = new HashSet<>();
        int sum = 36;
        System.out.println("Is pair present -> "+isPair(root,sum,hs));

    }
}
