package DynamicProgramming;

public class KnapsackProblemDpsolution {

    public static int knapSack(int W, int wt[], int val[]){
        int wn = wt.length;
        int vn = val.length;
        int dp[][] = new int[wn+1][vn+1];
        for(int i=0; i<=W; i++){
            dp[0][i]=0;
        }
        for(int j=0; j<=W; j++){
            dp[j][0]=0;
        }
        for(int i=1; i<=wn; i++){
            for(int j=1; j<=W; j++){
                if(wt[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]= Math.max(val[i-1]+dp[j-1][j-wt[i-1]],dp[i-1][j]);
                }
            }
        }
        return dp[wn][vn];
    }

    public static void main(String[] args) {
        int v[]= {10,40,30,50};
        int wt[]={5,4,6,3};
        int w=10;
        System.out.println("Value is -> "+knapSack(w,wt,v));

    }
}
