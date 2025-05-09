package Hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

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
        int arr[]={5,2,3};
        int sum=5;
        System.out.println("Longest sum is -> "+maxLen(arr,sum));
    }
}
