package Tree;
/*
addition of root equal to sum of left and right node.
 */
public class ChildrenSumProparty {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static boolean isSum(Node root){
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){
            sum += root.left.key;
        }
        if(root.right!=null){
            sum+=root.right.key;
        }

        return (root.key==sum && isSum(root.left) && isSum(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.right.left = new Node(3);
        root.right.right = new Node(9);
        System.out.println("Is Child sum -> "+isSum(root));
    }
}
