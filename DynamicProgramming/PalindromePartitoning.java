package DynamicProgramming;
/*
cut required to make string palindrome
(simillar element from start to end)
 */


public class PalindromePartitoning {

    public static int palPart(String s){
        int n= s.length();
        int dp[][] = new int[n][n];
        for(int i =0; i<n; i++){
            dp[i][i]=0;
        }
        for(int gap=1; gap<n; gap++){
            for(int i=0; i+gap<n; i++){
                int j = i+gap;
                if(isPalindrome(s, i, j)){
                    dp[i][j]=0;
                }else{
                    dp[i][j] = Integer.MAX_VALUE;
                    for(int k=i; k<j; k++){
                        dp[i][j] = Math.min(dp[i][j],
                                1+ dp[i][k]+dp[k+1][j]);
                    }
                }
            }
        }
        return dp[0][n-1];
    }

    private static boolean isPalindrome(String s, int i, int j) {
        if(s.charAt(i)==s.charAt(j)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "geek";
        System.out.println("Cut requried -> "+palPart(s));
    }
}
