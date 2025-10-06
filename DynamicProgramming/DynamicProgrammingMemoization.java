package DynamicProgramming;
/*
In recursion we are doing same call for multiple times
to reduce that and optimise the solution we have to reduce
recursion calls

here we are stroing each reacursion value inside
memo matrix
if value is present at index we are passing that to recursion
function directoly to reduce recusion calls

 */
public class DynamicProgrammingMemoization {

    public static int fibonacci(int n, int[] memo) {
        if (memo[n] != 0)
            return memo[n];
        if (n == 1 || n == 2)
            return 1;
        else {
            memo[n] = fibonacci(n - 1, memo)
                    + fibonacci(n - 2, memo);
            return memo[n];
        }
    }

        public static void main (String[]args){
            int n = 10;
            int[] memo = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                System.out.print(fibonacci(i, memo) + " ");
            }

        }

}
