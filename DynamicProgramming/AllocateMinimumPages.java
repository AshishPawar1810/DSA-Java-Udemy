package DynamicProgramming;

public class AllocateMinimumPages {

    public static int minPages(int arr[], int n, int k){
        int dp[][] = new int[k+1][n+1];
        for(int i=1; i<n; i++){
            dp[1][i]= sum(arr, 0, i-1);
        }
        for(int i=1; i<k; i++){
            dp[i][1] = arr[0];
        }
        for(int i = 2; i<=k; i++){
            for(int j=2; j<n; j++){
                int res = Integer.MAX_VALUE;
                for(int b =1; b<j; b++){
                    res = Integer.min(res, Integer.max(dp[i-1][b], sum(arr, b, j-1)));
                }
                dp[i][j]=res;
            }
        }
        return dp[k][n];
    }

    public static int sum(int arr[], int i, int j){
        int s=0;
        for(i=0; i<j; i++){
             s = i+j;
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int n=arr.length;
        int k =2;
        System.out.println("Add is -> "+minPages(arr, n, k));
    }
}
