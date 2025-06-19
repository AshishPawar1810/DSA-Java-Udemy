package Tree;
/*
Binary tree:
Every node has at-most two children compulsory
it can be represented using linked list
every node has 3 fields
1 data
2 left refrence
3 right refrence

useing array we can represent tree
but genrally represent Linked list

 */
public class BinaryTree {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        root.left.left= new Node(40);

    }
}
