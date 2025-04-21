package Searching;

public class RecursiveBinarySearch {

   public static int rSr(int arr[], int low, int high, int x){
       //base case
       if(low>high)
           return -1;
       int mid = (low+high)/2;
       if(arr[mid]==x)
           return mid;
       else if(arr[mid]>x)
           return rSr(arr,low, mid-1,x);
       else
           return rSr(arr,mid+1, high,x);
   }

    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int low =0;
        int n= arr.length;
        int high = n-1;
        System.out.println("ele at -> "+rSr(arr,low,high,50));
    }
}
