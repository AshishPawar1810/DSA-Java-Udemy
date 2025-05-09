package Hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {

    public static boolean subSum(int arr[], int sum){
        int preSum=0;
        HashSet<Integer > hs = new HashSet<>();
        for(int x : arr){
            preSum += x;
            if(hs.contains(sum-x)){
                return true;
            }else if(preSum==sum){
                return true;
            }else{
                hs.add(x);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,6};
        int sum =9;
        System.out.println("Sub array sum present ->"+subSum(arr,sum));
    }
}
