package Tree;

public class ImplPreorderTraversal {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void preOrderTra(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preOrderTra(root.left);
            preOrderTra(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right =new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        preOrderTra(root);
    }
}
