package Sorting;

import java.util.Arrays;

/*
in this type of problem you have two type of element in array
positive and negative
minus and plus
binary number array
even and odd
not working code
 */
public class SortArrayOfTwoTypes {

    public static int hovrePart(int arr[], int low, int high){
        int i=low-1;
        int j=high+1;
        int pivot = arr[low];
        while(true){
            do {
                i++;
            }while(arr[i]<pivot );
            do{
                j--;
            }while (arr[j]>pivot);
            if(i>j)
                return j;
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    public static void sort(int arr[], int low, int high){
        while(low<high){
            int pi= hovrePart(arr,low,high);
            sort(arr,low,pi);
            sort(arr,pi+1,high);
        }
    }

    public static void main(String[] args) {
        int arr[]={-12,18,-10,15};
        int n=arr.length;
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
