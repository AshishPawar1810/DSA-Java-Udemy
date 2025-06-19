package Tree;

public class BurnBinaryTreeFromLeaf {

    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public static class distance{
        int val;

        public distance(int val) {
            this.val = val;
        }
    }

    public static int burnTime(Node root, int leaf, distance dis){
        if (root == null) {
            return 0;
        }
        int res =0;
        if(root.key==leaf){
            dis.val=0;
            return 1;
        }
        distance ldist = new distance(-1);
        distance rdist = new distance(-1);

        int ls = burnTime(root.left,leaf,ldist);
        int rh = burnTime(root.right,leaf,rdist);

        if(ldist!=null){
            dis.val = ldist.val+1;
            res = Math.max(res, rh+ dis.val);
        }else if(rdist.val != -1){
            dis.val = rdist.val+1   ;
            res = Math.max(res, dis.val+1);
        }
        return Math.max(ls, rh)+1;

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.left.left = new Node(60);
        root.left.left.left.left = new Node(70);
        root.right = new Node(30);
        root.left.right = new Node(50);
        System.out.println("Burn time req is -> "+burnTime(root, 50,new distance(-1)));
    }
}
