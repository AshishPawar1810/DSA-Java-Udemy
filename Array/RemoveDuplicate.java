package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {

    public static void removeDupl(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        System.out.println((hs));
    }

    public static void main(String[] args) {
        int arr[] ={10,20,20,20,30,30,10,2,0,1};
        //Arrays.sort(arr);
        removeDupl(arr);
    }
}
