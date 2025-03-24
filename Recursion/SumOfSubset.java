package Recursion;
/*
sum is given need to genrate possible subset by minusing from array
 */

public class SumOfSubset    {

    public static int fun(int arr[], int n, int sum){
        if(n==0){
            return (sum==0) ? 1:0;
        }
        return (fun(arr, n-1, sum) +
           fun(arr, n-1,sum-arr[n-1]));
    }

    public static void main(String[] args) {
        int arr[] = {10,20,15};
        int n= arr.length;
        int sum = 25;
        System.out.println("Sum of subset -> "+fun(arr,n,sum));
    }
}
