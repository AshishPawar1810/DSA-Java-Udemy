package Sorting;

import java.util.Arrays;

/*
Here one array is given with 3 values
low mid high
from low to mid you have to separate array
then mid to high you have to separate another array
and sort them
 */
public class MergeFunctionOfMergeSort {

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
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]= {10,20,40,20,30};
        int low=0;
        int mid= 2;
        int high=4;
        mergeFun(arr,low,mid,high);

    }
}
