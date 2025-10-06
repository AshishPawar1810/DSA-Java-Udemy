package DynamicProgramming;

public class MinimumCoinToMakeValue {

    public static int getMin(int arr[], int val){
        int n=arr.length;
        int dp[]=new int[val+1];
        dp[0]=0;
        for(int i=0; i<=val; i++){
            dp[i]= Integer.MAX_VALUE;
        }
        for(int i=1; i<=val; i++){
            for(int j=0; j<n; j++){
                if(arr[j]<i){
                    int sub_res = dp[i-arr[j]];
                    if(sub_res != Integer.MAX_VALUE){
                        dp[i]=Integer.min(dp[i],sub_res+1);
                    }
                }
            }
        }
        return dp[val];
    }

    public static void main(String[] args) {
        int coins[] = {3,4,1};
        int val=5;
        System.out.print("Coin req to val -> "+getMin(coins,val));

    }
}
