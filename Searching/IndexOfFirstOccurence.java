package Searching;

public class IndexOfFirstOccurence {

    public static int firstOcc(int arr[], int x){
        int low =0;
        int n =arr.length;
        int high = n-1;

        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]==x)
                return mid;
            //{5,10,10,20,20};
            else if(arr[mid]<x)
                low = mid +1;
            else
                if(mid==0 || arr[mid]!=arr[mid-1]){
                    return mid;
                }
                else {
                    high =mid-1;
                }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={5,10,10,20,20};
        int x = 20;
        System.out.println("ele at -> "+firstOcc(arr,x));
    }
}
