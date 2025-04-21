package Searching;

public class IndexOfLastOccurence {

    public static int lastOcc(int arr[], int x, int n){
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x)
                low=mid+1;
            else if(arr[mid]>x)
                high = mid -1;
            else
                if(mid != n-1 || arr[mid] != arr[mid+1]){
                    return mid;
                }
                else
                    low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={5,10,10,10,10,20,20};
        int n= arr.length;
        int x =20;
        System.out.println("Last occ is at -> "+lastOcc(arr,x,n));
    }
}
