package Hashing;

import java.util.HashMap;

/*
IN this type of array two type of number is given
0 and 1
you need to count longest length of array
at which both element count is equal

 */
public class LongestSubArrayWithEqualOneZero {

    public static int logestSub(int arr[], int sum){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
       return maxLen(arr,sum);
    }

    public static int maxLen(int arr[], int sum){
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum=0; int res=0;
        for(int i=0; i<arr.length; i++){
            preSum += arr[i];
            if(preSum==sum) {
                res = i + 1;
            }
            if(map.containsValue(preSum)==false) {
                map.put(preSum, i);
            }
            if(map.containsValue(preSum-sum)) {
                res = Math.max(res, i - map.get(preSum - sum));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,0,0};
        System.out.println("Longes sub arry lenght is ->"+logestSub(arr,4));
    }
}
