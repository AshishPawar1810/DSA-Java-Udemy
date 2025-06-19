package Tree;

public class CheckForBalanceBinaryTree {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static int isBal(Node root){
        if(root==null){
            return 0;
        }
        int lh = isBal(root.left);
        if(lh==-1){
            return -1;
        }
        int rh = isBal(root.right);
        if(rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>-1){
            return -1;
        }else{
            return Math.max(lh, rh) +1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left= new Node(12);
        root.left.right = new Node(14);
        root.right = new Node(15);
        root.right.right = new Node(16);
        root.right.right.right = new Node(17);
        System.out.println("is bal -> "+isBal(root));

    }
}
