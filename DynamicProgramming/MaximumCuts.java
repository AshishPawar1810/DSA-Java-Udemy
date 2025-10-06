package DynamicProgramming;
/*
A rod length given
need to cut rod in maximum pieces

 */
public class MaximumCuts {

    public static int maxCut(int n, int a, int b, int c){
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1; i<=n; i++){
            dp[i]=-1;
            if(i-a>=0) {
                dp[i] = Integer.max(dp[i], dp[i - a]);
            }
            if(i-b>=0) {
                dp[i] = Integer.max(dp[i], dp[i - b]);
            }
            if(i-c>=0) {
                dp[i] = Integer.max(dp[i], dp[i - c]);
            }
            if(dp[i]!=-1) {
                dp[i]++;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=5;
        int a=1;
        int b=2;
        int c=3;
        System.out.println("Max cut for rod -> "+maxCut(n,a,b,c));
    }
}
