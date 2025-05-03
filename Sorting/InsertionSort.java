package Sorting;

import java.util.Arrays;

/*
Stable algorithm
Use for small array
time complexity O(n2)
In this array we place a key
and move towards right of array
left part become sort
i.e, key is moved towards right to sort left side array
 */
public class InsertionSort {

    public static void insertionSort(int arr[]  ){
        int n= arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j=i-1;
            //{20,5,40,60,10,30};
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]={20,5,40,60,10,30};
        insertionSort(arr);
    }
}
