package Tree;
/*
Two type of traverlse
1 Breadth first: Print node from Left to right like read to book L to R
2 Depth first : we go one side, we finish one side(using recursion)
                Travels root, travels left side, travels right side
                10
                /\
              20  30

    Inorder (Left Root Right) (20 10 30)
    Preorder (Root Left Right)(10 20 30)
    Postorder (Left Right Root)(20 30 10)
 */
public class TreeTravels {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void main(String[] args) {
        Node  root = new Node(10);
        root.left= new Node(20);
        root.right = new Node(30);
        root.left.left =new Node(40);
        root.left.right =new Node(50);
    }
}
