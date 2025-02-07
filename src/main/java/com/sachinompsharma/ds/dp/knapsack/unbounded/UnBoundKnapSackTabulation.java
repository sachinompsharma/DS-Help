package com.sachinompsharma.ds.dp.knapsack.unbounded;

public class UnBoundKnapSackTabulation {

    public static int [][] dp = new int[102][1002];
    public static void main(String[] args) {
        int capacity = 8, val []  = {10, 40, 50, 70}, wt[] = {1, 3, 4, 5};

        // Initialize the memo matrix

        for (int i = 0; i <= val.length ; i++) {
            for (int j = 0; j <= capacity ; j++) {
               if ( i == 0 || j == 0)
                   dp [i][j] = 0;
            }
        }

        System.out.println(knapsack(wt,val,val.length,capacity));
    }

    public static int knapsack(int [] wt, int [] val, int n, int w) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w ; j++) {

                if ( wt[i-1] <= j)
                    dp[i][j] =   Math.max(val[i-1] +dp[i][j - wt[i-1]], dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }

        }

        return  dp [n][w];

    }
}
