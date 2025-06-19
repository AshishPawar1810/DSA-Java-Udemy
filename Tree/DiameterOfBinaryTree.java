package Tree;
/*
longest continus connected node calles diameter
 */
public class DiameterOfBinaryTree {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }
    public static int diamNode(Node root){
        if(root==null){
            return 0;
        }
        int lh = diamNode(root.left);
        int rh = diamNode(root.right);
        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(60);
        root.right.left.left = new Node(60);
        root.right.right.right = new Node(70);
        System.out.println("Diameter is -> "+diamNode(root));

    }
}
