package Tree;

public class MaximumInBinaryTree {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static int getMax(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Integer.max(root.key, Integer.max(getMax(root.left), getMax(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.right = new Node(50);
        root.left.left = new Node(40);
        root.right = new Node(30);
        root.right.right = new Node(60);
        System.out.println("Max value is -> "+getMax(root));
    }
}
