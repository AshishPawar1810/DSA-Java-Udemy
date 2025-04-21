package Searching;
/*
find the peak element
an unsorted array given
A peak element is element in which its current elements right side element is smaller
eg if 80,70
peak element is 80 beacuse next eleme to it is smaller than left
Here remeber one thing that a element which is
A element which has both side element are smaller i.e., left and right
then only consider as peak element
eg {5, 20, 7}
20 is peak element here beacuse both side element are smaller
 */
public class FindPeakElement {

    public static int peakEle(int arr[]){
        int n= arr.length;
        int low =0; int high = n-1;
        while(low<=high){
            int mid =(low+high)/2;
            if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid]))
                return mid;
            if(mid>0 && arr[mid-1]>=arr[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={5,10,20,60,80,70};
        System.out.println("Peak ele is -> "+peakEle(arr));

    }
}
