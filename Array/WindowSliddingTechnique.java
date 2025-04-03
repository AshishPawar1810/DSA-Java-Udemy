package Array;
/*
Window slidding techinque is use to fine the maxium k group sum.
It should be maximum
eg. [1,8,30,-5,20,7]
in above array max sub is from arr[2] to arr[4] which is 30+(-5)+20 =45
 */
public class WindowSliddingTechnique {

    public static int slTech(int arr[], int k){
        int n= arr.length;
        int curr=0;
        int res =0;
        for(int i=0; i<k; i++){
            curr += arr[i];
        }
        res= curr;
        for(int i=k; i<n; i++){
            curr= curr + arr[i] - arr[i-k];
            res = Integer.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] ={1,8,30,-5,20,7};
        System.out.println("Max sum is form index "+slTech(arr,3));
    }
}
