package Sorting;

import java.util.Arrays;

/*

 */
public class MinimumDiffrenceInArray {

    public static int minDiff(int arr[]){
        int res=0;
        Arrays.sort(arr);
        int n= arr.length;
        System.out.println(Arrays.toString(arr));
        for(int i=1; i<n; i++){
            res=Integer.min(res,(arr[i]-arr[i-1]));
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] ={10,8,1,4};
        System.out.println("Min diff is -> "+minDiff(arr));
    }
}
