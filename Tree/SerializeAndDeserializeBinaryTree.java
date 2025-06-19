package Tree;

import java.util.ArrayList;
import java.util.Arrays;

/*
Serialization : converting given binary tree into String or Array
Deserialization : converting String or array into binary tree
Application :
to send binary tree over network


 */
public class SerializeAndDeserializeBinaryTree {

    public static final int EMPTY = -1;

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void serialization(Node root, ArrayList<Integer> al){
        if(root==null){
            al.add(EMPTY);
            return;
        }
        al.add(root.key);
        serialization(root.left,al);
        serialization(root.right,al);
    }

    public static Node deserialization(ArrayList<Integer> arr){
        if(arr.isEmpty()){
            return null;
        }
        int val =0;
        Node root = new Node(val);

        for(int i=0; i<arr.size(); i++) {
            val = arr.get(i);
            if (val == EMPTY) {
                return null;
            }
        }
        root.left = deserialization(arr);
        root.right = deserialization(arr);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        ArrayList<Integer> al = new ArrayList<>();
        serialization(root, al);
        System.out.println(al);
        deserialization(al);

    }
}
