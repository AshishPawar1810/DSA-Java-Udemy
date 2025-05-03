package Sorting;

import java.util.Arrays;

/*
work much more efficent than hoarepartition
Consider first element as pivot element
All element which are greater than pivot should move to right
All small element than pivot should move towards left element
 */
public class HoarePartition {

    public static void hoarePart(int arr[], int low, int high){
        int n=arr.length   ;
        int pivot=arr[0];
        int i=-1; int j=n;

        while(true){
            do{
                i++;
            }while (arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>j) {
                break;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={5,3,8,4,2,7,1,10};
        int n=arr.length;
        hoarePart(arr,0,n-1);
    }
}


