package BinarySearchTree;

import java.util.*;

public class VerticalTraversalOfBST {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static class pair{
        Node node;
        int hd;

        public pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void verticalOrder(Node root){
        Queue<pair> q= new LinkedList<>();
        Map<Integer, ArrayList<Integer>> mp = new TreeMap<>();
        q.add(new pair(root,0));
        while ((!q.isEmpty())){
            pair p = q.poll();
            Node curr= p.node;
            int hd = p.hd;
            if(mp.containsKey(hd)){
                mp.get(hd).add(curr.key);
            }else{
                ArrayList<Integer > al = new ArrayList<>();
                al.add(curr.key);
                mp.put(hd, al);
            }
            if(curr.left!=null){
                q.add(new pair(curr.left, hd-1));
            }
            if(curr.right!=null){
                q.add(new pair(curr.right, hd+1));
            }
            for(Map.Entry m : mp.entrySet()){
                System.out.println(m.getValue()+" ");
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(18);
        root.right.right = new Node(35);
        verticalOrder(root);
    }
}
