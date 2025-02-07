package com.sachinompsharma.ds.dp.knapsack.unbounded;

public class CoinChangeMinNoOfCoinsTabulation {

    public static int [][] dp = new int[100][100];
    public static void main(String[] args) {
        int [] coins = {9, 6, 5, 1,19} ;
        int sum = 19;

        // second case
        //int [] coins = {4, 6, 2};
        //int sum = 5;
        int n = coins.length;
        initialize(n,sum,coins);
        int ans = solve(coins, n, sum);
        System.out.println( ans != Integer.MAX_VALUE -1 ? ans : -1);
    }
    public static void initialize(int n, int sum, int [] coins) {

        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <= sum ; j++) {
                if( j == 0)
                    dp[i][j] = Integer.MAX_VALUE - 1;

                if( i == 0 )
                    dp[i][j] = 0;
            }

        }

        for (int j = 1; j <= sum ; j++) {

            if( j % coins[0] == 0)
                dp[1][j] = j / coins[0];
            else
                dp[1][j] = Integer.MAX_VALUE - 1;
        }
    }

    public static int solve( int [] coins, int n, int sum){

        for (int i = 2; i <=n ; i++) {                 // Important line as we have fill the zeroth and first row already.
            for (int j = 1; j <=sum ; j++) {

                if ( coins[i-1] <= j)
                    dp[i][j] = Math.min(1 + dp[i][j-coins[i-1]],
                            dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n][sum];
    }

}



