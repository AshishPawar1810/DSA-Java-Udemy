package Tree;

public class SizeOfBinaryTree {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

   public static int sizeOfTree(Node root){
        if(root==null){
            return 0;
        }
        return (sizeOfTree(root.left)) + (sizeOfTree(root.right)) +1;
   }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.right = new Node(50);
        root.left.left = new Node(40);
        root.right = new Node(30);
        root.right.right = new Node(60);
        System.out.println("Size of tree -> "+sizeOfTree(root));

    }
}
