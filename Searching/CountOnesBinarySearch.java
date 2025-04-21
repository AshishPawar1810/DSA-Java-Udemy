package Searching;
/*
count 1s in sorted binary ARRAY
 */
public class CountOnesBinarySearch {

    public static int countOne(int arr[]){
        int n= arr.length;
        int low=0;
        int high =n-1;

        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==0)
                low=mid+1;
            else
                if(mid==0 || arr[mid-1]==0)
                    return (n-mid);
                else
                    high =mid-1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,1,1,1};
        System.out.println("1s count is -> "+countOne(arr));
    }
}
