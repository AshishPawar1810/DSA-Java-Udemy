package Searching;
/*
In this type of problem a roated array given to you
where its 2 or 3 element are shifted to end of array
then you need to find element using binary search array
 */
public class SearchInSortRoatedArray {

    public static int search(int arr[], int x){
        int n= arr.length;
        int low=0; int high =n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[low]<arr[mid] )
                if(arr[low]<=x && arr[mid]>=x)
                    high = mid-1;
                else
                    low = mid+1;
            else
                if(x >=arr[mid] && x<=arr[high])
                    low = mid+1;
                else
                    high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={10,20,40,60,5,8};
        int x= 5;
        System.out.println("Element is at -> "+search(arr,x));
    }
}
