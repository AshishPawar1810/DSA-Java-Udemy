package DynamicProgramming;
/*From F floors Number of E eggs were drops
 */

public class EggDroppingPuzzle {

    public static int res(int f, int e){
        int dp[][] = new int[f+1][e+1];
        for(int i=1; i<=e; i++){
            dp[1][i]=1;
            dp[0][i]=0;
        }
        for(int j=1; j<=f; j++){
            dp[j][1]=j;
        }
        for(int i=2; i<=f; i++){
            for(int j=2; j<=e; j++){
                dp[i][j]= Integer.MAX_VALUE;
                for(int x=1; x<=i; x++){
                    dp[i][j] = Math.min(dp[i][j], 1 + Math.max((dp[x-1][j-1]),dp[i-x][j]));
                }
            }
        }
        return dp[f][e];
    }


    public static void main(String[] args) {
        int f=3;
        int e=2;
        System.out.println("Egg drop break -> "+res(f,e));

    }
}
