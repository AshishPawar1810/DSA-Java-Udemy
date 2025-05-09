package Hashing;

import java.util.HashSet;

/*
what is sub array
[ 10 20 30]
sub array are
[10]
[20] [10 20] [30]
continous element pair means sub array
 */
public class SubArrayWithZeroSum {

    public static boolean isSubArray(int arr[]){
        HashSet<Integer> hs = new HashSet<>()   ;
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(hs.contains(sum)){
                return true;
            }else if (sum==0){
                return true;
            }else{
                hs.add(sum);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]   = {-3,4,-3,-1,1};
        System.out.println("is sub array sub zero ->"+isSubArray(arr));
    }
}
