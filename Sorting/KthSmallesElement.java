package Sorting;

import java.util.Arrays;

/*
Kth Smallest element
in this type of problem an array and K value given
A K value is means a smallest element at that point
eg. If k=2
then find the second smallest element
K=4
find the 4th smallest element in array
 */
public class KthSmallesElement {

   public static int hovarePartion(int arr[], int low, int high){
       int i=low-1;
       int j=high+1;
       int pivot=arr[0];
       while(true){
           do{
               i++;
           }while(arr[i]<pivot);
           do{
               j--;
           }while(arr[j]>pivot);
           if(i>j){
               return j;
           }
           int temp= arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
   }

   public static int kThSmallest(int arr[], int n, int k){
       int low=0;
       int high=n-1;
       while(low<high) {
           int pi=hovarePartion(arr,low,high);
           if (pi == k - 1) {
               return pi;
           } else if (pi > k - 1) {
               high = pi - 1;
           } else {
               low = pi + 1;
           }
       }
       return -1;
   }

    public static void main(String[] args) {
        int arr[]={10,4,5,8,11,6,26};
        int k=5;
        int n=arr.length;
        System.out.println("Kth smalles is -> "+kThSmallest(arr,n,k));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
