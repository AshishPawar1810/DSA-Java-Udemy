package DynamicProgramming;

public class CoinChangeNaiveRecu {

    public static int countWays(int coins[], int n,int sum){
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(n==0){
            return 0;
        }
        return countWays(coins, n, sum-coins[n-1]) +
                countWays(coins, n-1, sum);

    }

    public static void main(String[] args) {
        int coins[] = {2,5,3};
        int sum =5;
        int n=coins.length;
        System.out.println("coins req -> "+countWays(coins,n,sum));

    }
}
