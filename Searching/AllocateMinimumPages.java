package Searching;

public class AllocateMinimumPages {

    public static int minPages(int arr[], int k){
        int n= arr.length;
        int max =0;
        int sum =0;
        for(int i=0; i<n; i++){
            sum +=arr[i];
            max = Math.max(max,arr[i]);
        }

        int low=0; int high=max; int res=0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isFensible(arr, n, k,mid)){
                res = mid;
                high =mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;

    }

    public static boolean isFensible(int arr[], int n, int k, int ans){
        int res =1; int sum =0;
        for(int i=0; i<n; i++)
            if(sum+arr[i]>ans){
                res++;
                sum=arr[i];

            }
        return (res<=k);
    }
    public static void main(String[] args) {
        int arr[]={10,5,20};
        int k=2;
        System.out.println("Minimum pages are -> "+minPages(arr,k));

    }
}
