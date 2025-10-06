package DynamicProgramming;

public class MaximumSumWithNoConsecutive {

    public static int maxSum(int arr[], int n){
        if(n==1){
            return arr[0];
        }
        int dp[]= new int[n+1];
        dp[1]=arr[0];
        dp[2]=Integer.max(arr[0], arr[1]);

        for(int i=3; i<=n; i++){
            dp[i] = Math.max(dp[i], dp[i-2]+arr[i-1]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int n=arr.length;
        System.out.println("Max Add is -> "+maxSum(arr,n));
    }
}
