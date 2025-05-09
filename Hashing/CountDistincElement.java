package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CountDistincElement {

    public static int countDistinct(int arr[]){
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hash.add(arr[i]);
        }
        System.out.println(hash);
        return hash.size();

    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,5,6,6,6,6,6,6};
        System.out.println("disticnt element are -> "+countDistinct(arr));
    }
}
