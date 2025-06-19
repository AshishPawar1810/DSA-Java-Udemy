package Tree;
/*
Lowest Common Ancestor(LCA)
Ancestor means a longestes connected chain node
in this type of problem you have to find two common
connected node
then find the lowest level of node in it
 */
public class LCAOfBinaryTreePartTwo {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static Node lca(Node root, int n1, int n2){
        if(root==null){
            return null;
        }
        if(root.key ==n1 || root.key==n2){
            return root;
        }
        Node lca1 = lca(root.left,n1,n2);
        Node lca2 = lca(root.right, n1,n2);
        if(lca1!=null && lca2!=null){
            return root ;
        }
        if(lca1!=null){
            return lca1;
        }else{
            return lca2;
        }

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(50);
        root.right.left.left = new Node(70);
        root.right.right = new Node(60);
        root.right.right.left = new Node(80);
        root.right.right.right = new Node(90);
        root.right.right.right.right = new Node(40);
        System.out.println("lca is -> "+lca(root,30,80));
    }
}
