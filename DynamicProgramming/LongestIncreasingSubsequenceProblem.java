package DynamicProgramming;

public class LongestIncreasingSubsequenceProblem {

    public static int lis(int arr[]){
        int n=arr.length;
        int tail[]= new int[n];
        int lin =1;
        tail[0]=arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>tail[lin-1]){
                tail[lin]=arr[i];
                lin++;
            }else{
                int c= ceilIndx(tail,0,lin-1,arr[i]);{
                    tail[c]=arr[i];
                }
            }
        }
        return lin;
    }

    public static int ceilIndx(int tail[], int l, int r, int x){
        while(r>l){
            int m= l + (r-l)/2;
            if(tail[m]>=x){
                r=m;
            }else{
                l=m+1;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int arr[] ={3,10,20,4,6,7};
        System.out.println("Longest common subsequence is  -> "+lis(arr));
    }
}
