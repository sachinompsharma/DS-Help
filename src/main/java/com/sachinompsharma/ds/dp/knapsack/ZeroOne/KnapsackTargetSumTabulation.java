package com.sachinompsharma.ds.dp.knapsack.ZeroOne;

public class KnapsackTargetSumTabulation {

    static int [][] dp = new int[102][1003];
    public static void main(String[] args) {

        int [] wt = { 1, 1, 1, 1, 1 };
        int target = 3;

        int sum = 0;
        for (int i : wt) {
            sum += i;
        }
        int n = wt.length;
        int w = ( target + sum ) / 2;


        System.out.println(knapsack(wt,n,w));
    }

    public static int knapsack(int [] wt, int n, int w) {

        //Initialization

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= w ; j++) {
                if ( i == 0)
                    dp[i][j] = 0;
                if ( j == 0)
                    dp[i][j] = 1;
             }
        }

        for (int i = 1; i <= n  ; i++) {
            for (int j = 1; j <= w ; j++) {

                if ( wt[i -1 ] <=  j)
                    dp[i][j] = dp [i-1][j - wt[i-1]] + dp [i-1][j];
                else
                    dp[i][j] =  dp[i-1][j];
            }
        }

        return dp[n][w];
    }
}
