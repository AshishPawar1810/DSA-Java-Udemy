package BinarySearchTree;
/*
In this type of problem you have given a binary tree
You need to add matching vertical nodes and print it
in below program 10 and 40 Nodes are in same vertical line
so you need to print both nodes addition and print node.
 */
import java.util.Map;
import java.util.TreeMap;

public class VerticalSumInBinaryTree {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void isSum(Node root, int hd, TreeMap<Integer, Integer> tm){
        if(root==null){
            return;
        }
        isSum(root.left, hd-1, tm);
        int pSum = (tm.get(hd)==null) ? 0 : tm.get(hd);
        tm.put(hd, pSum+root.key);
        isSum(root.right, hd+1, tm);
    }

    public static void vSum(Node root){
        TreeMap<Integer, Integer> t = new TreeMap<>();
        isSum(root, 0, t);
        for(Map.Entry sum : t.entrySet()){
            System.out.print(sum.getValue()+" ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right = new Node(50);
        vSum(root);
    }
}
