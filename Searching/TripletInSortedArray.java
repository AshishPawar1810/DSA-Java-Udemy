package Searching;
/*
Same problem as two point approach
only need to find three element whose sum is target
 */
public class TripletInSortedArray {

    public static boolean isPair(int arr[], int x){
        int n= arr.length;
        int i=0;
        int j =n-1;
        while(i<j){
            if(arr[i]+arr[j]==x)
                return true;
            else if(arr[i]+arr[j]<x)
                i++;
            else
                j--;
        }
        return false;
    }

    public static boolean isTriplet(int arr[], int x){
        int n= arr.length;
        for(int i=0; i<n-2; i++ ){
            if(isPair(arr,x-arr[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] ={2,5,10,15,18};
        int x=33;
        System.out.println("Is triples present -> "+isTriplet(arr,x));
    }
}
