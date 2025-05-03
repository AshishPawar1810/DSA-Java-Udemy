package Sorting;

import java.util.Arrays;

/*
The pivot is always last element in array

 */
public class LumutoPartition {

    public static void lumutoPart(int arr[], int low, int high){
        int n=arr.length;
        int pivot= arr[n-1];
        int i=low-1;

        for(int j=low; j<n; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int secTemp = arr[i+1];
        arr[i+1]=arr[high-1];
        arr[high-1]=secTemp;
        System.out.println(Arrays.toString(arr));
        //return i+1;

    }

    public static void main(String[] args) {
        int arr[]={10,80,30,90,40,50,70};
        int low=0;
        int n=arr.length;
        int high =n-1;
        //System.out.println("Result is -> "+lumutoPart(arr,low,high));
        lumutoPart(arr,low,high);
    }
}
