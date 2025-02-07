package com.sachinompsharma.ds.dp.knapsack.unbounded;

public class CoinChangeNoOfWaysMemoization {

    public static int [][] memo = new int [10034][10043];
    public static void main(String[] args) {
        int sum = 4;
        int []coins = {1, 2, 3,4};


        // Initialization
        for (int i = 0; i <= coins.length ; i++) {
            for (int j = 0; j <= sum ; j++) {
                memo[i][j] = -1;
            }
        }

        System.out.println(solve(coins, coins.length, sum));
    }

    public static int solve(int [] coins, int n, int sum) {

        if( sum == 0)
            return 1;
        if (n == 0)
            return 0;

        if( memo[n][sum] != -1)
            return memo[n][sum];

        if ( coins[n-1] <= sum){

            return  memo[n][sum] = solve(coins, n, sum - coins[n-1]) +
                    solve(coins, n -1 , sum);
        }
        else
            return memo[n][sum] = solve(coins, n-1, sum);
    }
}
