package Sorting;

import java.util.Arrays;

/*
In this type of problem you have given array of choclets packts
[7 3 2 4 9 12 56]
in first packet 7 chockets were there
You also given no of student as m

 */
public class ChocletDistibutionProblem {

    public static int minDiff(int arr[], int m){
        int n= arr.length;
        if(m>n)
            return -1;
        Arrays.sort(arr);
        int res = arr[m-1]-arr[0];
        for(int i=0; i<n-1; i++){
            res = Integer.min(res, arr[i+m-1]-arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={7,3,1,8,9,12,56};
        int m=3;
        System.out.println("Min diff is -> "+minDiff(arr,m));
    }

}
