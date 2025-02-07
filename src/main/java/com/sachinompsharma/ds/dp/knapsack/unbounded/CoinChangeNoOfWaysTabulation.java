package com.sachinompsharma.ds.dp.knapsack.unbounded;

public class CoinChangeNoOfWaysTabulation {

    public static int [][] dp = new int [10034][10043];
    public static void main(String[] args) {
        int sum = 4;
        int []coins = {1, 2, 3};


        // Initialization
        for (int i = 0; i <= coins.length ; i++) {
            for (int j = 0; j <= sum ; j++) {
               if ( i == 0)
                   dp[i][j] = 0;
               if ( j == 0)
                   dp[i][j] = 1;
            }
        }

        System.out.println(solve(coins, coins.length, sum));
    }

    public static int solve(int [] coins, int n, int sum) {

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= sum ; j++) {
                if ( coins[ i - 1] <= j)
                    dp[i][j] = dp[i][j-coins[i-1]] + dp [i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n][sum];
    }
}
