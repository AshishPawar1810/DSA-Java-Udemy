package Tree;

public class ImplOfInorderTraversal {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.key+" ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        inOrder(root);

    }
}

