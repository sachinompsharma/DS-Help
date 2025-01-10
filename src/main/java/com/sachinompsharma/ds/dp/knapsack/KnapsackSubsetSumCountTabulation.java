package com.sachinompsharma.ds.dp.knapsack;

public class KnapsackSubsetSumCountTabulation {
    static int [][] dp = new int[102][1002];
    public static void main(String[] args) {
        int [] wt = {1,2,3,7,8,10,11,10};
        int sum = 11;
        int n = wt.length;

        //Initialize the dp matrix
        for (int i = 0; i <=n  ; i++) {
            for (int j = 0; j <=sum ; j++) {

                if ( i == 0)
                    dp [i][j] = 0;
                if ( j == 0 )
                    dp[i][j] = 1;
            }
        }
        System.out.println(knapsack(wt,n,sum));
    }

    public static int knapsack(int [] wt, int n , int w) {

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= w ; j++) {

                if ( wt[i-1] <= j)
                    dp[i][j] = dp [i-1][j-wt[i-1]] + dp [i-1][j];
                else
                    dp[i][j] = dp [i-1][j];
            }
        }
        return  dp[n][w];
    }
}
