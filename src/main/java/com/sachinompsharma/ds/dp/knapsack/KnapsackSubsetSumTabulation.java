package com.sachinompsharma.ds.dp.knapsack;

public class KnapsackSubsetSumTabulation {
    public static void main(String[] args) {
        int [] wt = {2,3,7,8,10};
        int sum = 11;
        int n = wt.length;
        System.out.println(knapsack(wt,n,sum));
    }

    public static boolean knapsack(int []wt, int n, int w) {

        boolean [][] dp = new boolean[n+2][w+2];

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <=w ; j++) {
                if (i == 0)
                    dp[i][j] = false;

                if ( j == 0)
                    dp[i][j] = true;

            }
        }


            for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=w ; j++) {

                if( wt[i-1] <= j){
                    dp [i][j] = dp [i - 1][ j - wt[i-1]] || dp [i-1][j];
                }
                else{
                    dp [i][j] = dp [i-1][j];
                }

            }
        }
        return dp [n][w];
    }
}
