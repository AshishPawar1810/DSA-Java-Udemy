package Greedy;

import java.util.PriorityQueue;

/*
HuffmenCoding :
if you want to compress data without
data loss then we use huffmen coding

 */
public class HuffmenCodingIntroduction {

    public static class Node{
        char ch;
        int freq;
        Node left;
        Node right;

        public Node(char ch, int freq, Node left, Node right) {
            this.ch = ch;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }
    }

    public static void printHCode(char[] ch, int[] fre){
        PriorityQueue<Node> pq = new PriorityQueue<>((n1,n2)->n1.freq-n2.freq);
        for(int i=0; i<ch.length; i++){
            pq.add(new Node(ch[i], fre[i],null,null));
        }
        while (pq.size()>1){
            Node l = pq.poll();
            Node r = pq.poll();
            pq.add(new Node('$',l.freq+r.freq, l, r));
        }
        printRic(pq.peek(),"");
    }

    public static void printRic(Node root, String s){
        if(root.ch != '$'){
            System.out.print(root.ch+" "+s);
            return;
        }
        printRic(root.left, s+"0");
        printRic(root.right, s+"1");
    }

    public static void main(String[] args) {
        char arr[] ={'a','d','e','f'};
        int freq[] = {30,40,80,60};
        printHCode(arr,freq);
    }
}
