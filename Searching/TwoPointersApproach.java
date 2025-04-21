package Searching;
/*
This kind or problem array is given and need to fine sum of two element equal to sum
this element present in given array whose sum is given
In two pointer approach we have two end
start and end of array
here we are incrementing start and decrementing end
to get pair of addition for sum
 */
public class TwoPointersApproach {

   public static boolean sumEle(int arr[], int x){
       int n= arr.length;
       int i=0; int j=n-1;
       while(i<j){
           if(arr[i]+arr[j]==x)
               return true;
           if(arr[i]+arr[j]<x)
               i++;
           else
               j--;
       }
       return false;
   }
    public static void main(String[] args) {
        int arr[] ={2,5,8,12,30};
        int x= 20;
        System.out.println("Sum of x is present -> "+sumEle(arr,x));
    }
}
