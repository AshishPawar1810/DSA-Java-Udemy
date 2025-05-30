package Sorting;

import java.util.Arrays;

/*
Merge sort is divide and conquer algorithm
array marked L to R
From left two Right
atleast 2 element should present in array

 */
public class MergeSort {

    public static void mergeFun(int arr[],int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int left[]= new int[n1];
        int right[]= new int[n2];

        for(int i=0; i<n1; i++){
            left[i]=arr[low+i];
        }

        for(int i=0; i<n2; i++){
            right[i]=arr[mid+i+1];
        }

        int i=0; int j=0; int k=low;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++; k++;
            }else{
                arr[k]=right[j];
                j++; k++;
            }
        }

        while(i<n1){
            arr[k]=left[i];
            i++; k++;
        }

        while(j<n2){
            arr[k]=right[j];
            j++; k++;
        }

    }

    public static void mergeSort(int arr[], int l, int r){
        if(l<r){
            int m = l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            mergeFun(arr,l,m,r);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,30,15,7};
        int low=0;
        int n= arr.length;
        int high= n-1;
        mergeSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
}
