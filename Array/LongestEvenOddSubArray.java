package Array;
/*
In this problem we are checking that the occurence of array element are even then odd
format are not
 */
public class LongestEvenOddSubArray {

    public static int evenOdd(int arr[]){
        int n = arr.length;
        int res =1;
        int curr=1;
        for(int i=1; i<n; i++){
            if(arr[i]%2==0 && arr[i-1]%2==0
            || arr[i]%2==0 && arr[i-1]==0){
                curr++;
                res = Integer.max(res,curr);
            }
            else{
                curr=1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] ={5,10,20,6,3,8};
        System.out.println("Even odd -> "+evenOdd(arr));

    }
}
