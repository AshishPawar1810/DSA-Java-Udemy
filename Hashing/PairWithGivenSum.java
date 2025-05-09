package Hashing;

import java.util.HashSet;

public class PairWithGivenSum {

    public static boolean isPair(int arr[], int sum){
        HashSet<Integer> hs = new HashSet<>();
        for(int x : arr){
            if(hs.contains(sum-x)){
                return true;
            }
            else{
                hs.add(x);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={8,3,4,2,5};
        int sum =6;
        System.out.println("Pair present -> "+isPair(arr,sum));
    }
}
