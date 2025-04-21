package Searching;
/*
work for sorted array
 */
public class BinarySearch {

    public static int binarySearch(int arr[], int x){
        int low =0;
        int n =arr.length;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
                if(arr[mid]==x) {
                    return mid;
                }
                else if(arr[mid]>x) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};
        System.out.println("Element is at position -> "+binarySearch(arr,80));
    }
}
