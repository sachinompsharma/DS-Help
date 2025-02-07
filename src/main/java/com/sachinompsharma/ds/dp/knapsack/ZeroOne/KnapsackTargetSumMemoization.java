package com.sachinompsharma.ds.dp.knapsack.ZeroOne;

public class KnapsackTargetSumMemoization {

    static int [][] memo = new int[102][1003];

    public static void main(String[] args) {

        // Initialization

        int [] wt = { 1, 1, 1, 1, 1 };
        int target = 3;

        int sum = 0;
        for (int i : wt) {
            sum += i;
        }
        int n = wt.length;
        int w = ( target + sum ) / 2;

        // Initialization
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= w ; j++) {
                memo[i][j] = -1;
            }
        }

        System.out.println(knapsack(wt,n,w));
    }

    public static int knapsack( int [] wt, int n , int w) {

        if( w == 0) return 1;
        if ( n == 0) return 0;

        if ( memo[n][w] != -1)
            return memo[n][w];

        if ( wt[n-1] <= w){
            return memo[n][w] = knapsack(wt,n-1, w - wt[n-1]) +
                    knapsack(wt, n-1 , w);
        }
        else
            return memo[n][w] = knapsack(wt, n-1, w);
    }
}
