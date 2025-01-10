package com.sachinompsharma.ds.dp.knapsack;

public class KnapsackCountSubsetSumDiffTabulation {

    public static int [][] dp =  new int[102][1003];
    public static void main(String[] args) {

        int [] wt = {1, 2, 3, 1, 2};
        int diff = 1;
        int sum = 0;
        int n = wt.length;
        for (int w : wt) {
            sum += w;
        }

        int w =  ( sum + diff ) / 2;
        System.out.println(knapsack(wt,n, w));

    }

    public static int knapsack(int [] wt, int n , int w) {

        // Initialize

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= w ; j++) {
                if ( i == 0 )
                    dp[i][j] = 0 ;

                if ( j == 0)
                    dp[i][j] = 1;
            }
        }

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= w ; j++) {

                if (wt[i-1] <= j){
                    dp[i][j] = dp[i-1][j- wt[i-1]] + dp[i-1][j];
                }
                else
                    dp[i][j] = dp[i-1][j];
            }

        }
        return dp[n][w];
    }
}
