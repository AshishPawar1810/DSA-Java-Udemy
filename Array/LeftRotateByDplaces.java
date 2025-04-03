package Array;

import java.util.Arrays;
import java.util.Collections;

public class LeftRotateByDplaces {

    public static void dPla(int arr[], int d){
        int n= arr.length;
        //reverse from 0 to d means 0 to 2
        reverse(arr, 0, d-1);

        //reverse 2 to n
        reverse(arr,d,n-1);

        //reverse hole array from 0 to n
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int arr[], int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
            int arr[]={0,0,1,1,1};
            dPla(arr,2);

    }
}
