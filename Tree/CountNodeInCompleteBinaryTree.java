package Tree;
/*
complete binary tree : A tree which filled from nodes from left to right
means equal parent and child node from left to right
first filled left side completly , if few nodes missing from rights side
then still considered as complete binary tree.
Only allowed to miss last nodes from both side

 */
public class CountNodeInCompleteBinaryTree {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        return  1+ countNode(root.left) + countNode(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.left.left = new Node(80);
        root.left.left.right = new Node(90);
        root.left.right.left = new Node(100);
        root.left.right.right = new Node(110);
        root.right = new Node(30);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.right.left.left = new Node(120);
        System.out.println("Total nodes are -> "+countNode(root));
    }
}
