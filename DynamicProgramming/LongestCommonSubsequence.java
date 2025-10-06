package DynamicProgramming;

import java.util.Arrays;

/*

 */
public class LongestCommonSubsequence {

    static int lcs(String X, String Y, int m, int n, int dp[][]) {

        if (m == 0 || n == 0) {
            return 0;
        }
        if (dp[m - 1][n - 1] != -1) {
            return dp[m - 1][n - 1];
        }
        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            dp[m - 1][n - 1] = 1 + lcs(X, Y, m - 1, n - 1, dp);
            return dp[m - 1][n - 1];
        } else {
            dp[m - 1][n - 1] = Math.max(lcs(X, Y, m, n - 1, dp),
                    lcs(X, Y, m - 1, n, dp));

            return dp[m - 1][n - 1];
        }
    }

    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int m = X.length();
        int n = Y.length();
        final int maximum = 1000;
        int dp[][] = new int[m][maximum];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println("Length of LCS: " + lcs(X, Y, m, n, dp));
    }
}
