package Hashing;

import java.util.HashSet;

public class UnionOfTwoSortedArrays {

    public static void unionOf(int first[], int sec[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<first.length; i++){
            hs.add(first[i]);
        }

        for(int j=0; j<sec.length; j++){
            hs.add(sec[j]);
        }

        System.out.println("Distict elemetn are ->"+hs);
    }

    public static void main(String[] args) {
        int first[]= {10,30,10,40};
        int sec[]= {40,5,10,15};
        unionOf(first,sec);
    }
}
