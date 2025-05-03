package Sorting;

import java.util.Arrays;

/*
In this type of problem you have given index of array element
you have to sort array till that value at left and the number greater than
value should place after it.
eg. [3 8 6 12 10 7]
p=5 i.e element=7
[3 6 7 8 12 10]
 */
public class NaivePartition {

    public static void partition(int arr[], int low, int high, int p){
        int temp[]=new int[high-low+1];
        int indx =0;
        for(int i=low; i<arr.length; i++){
            if(arr[i]<=arr[p] && i!=p){
                temp[indx]=arr[i];
                indx++;
                temp[indx++]=arr[p];
            }
        }

        for(int i=low; i<=arr.length; i++){
            if(arr[i]>arr[p]){
                temp[indx] =arr[i];
                indx++;
            }
        }

        for(int i=low; i<=arr.length; i++){
            arr[i]= temp[i-low];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]={5, 13, 6,9, 12,11,8};
        int p= 6;
        int low=0;
        int n= arr.length;
        int high=n-1;
        partition(arr,low,high,p);
    }
}
