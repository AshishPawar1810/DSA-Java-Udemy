package BinarySearchTree;
/*
floor in BST:
in this type of problem you have given a key value
you just need to find first less value than key
 */
public class FloorInBst {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static Node floorNode(Node root, int x){
        Node res =null;
        while(root!=null){
            if(root.key==x){
                return root;
            }
            else if(root.key>x){
                root=root.left;
            }else{
                res=root;
                root=root.right;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        root.right.left.left = new Node(55);
        root.right.left.right = new Node(65);
        floorNode(root,58);
    }
}
