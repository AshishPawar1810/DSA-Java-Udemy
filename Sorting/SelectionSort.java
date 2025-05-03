package Sorting;

import java.util.Arrays;
import java.util.Collections;

/*
Comparsion based alorithm
time complexity is On2
Take less memory write to compare other algorithams
were memory write are expensive then you can go for this
The basic idea behind selection sort is
find minimum element at place it at first position and so on
Not stable aloritham in terms of same element present

 */
public class SelectionSort {

    public static void selSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
           int min =i;
           for(int j=i+1; j<n; j++){
               if(arr[j]<arr[min]){
                   int temp = arr[j];
                   arr[j]=arr[min];
                   arr[min]=temp;
               }
           }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int farr[]={50,20,40,30,10};
        selSort(farr);

    }
}
