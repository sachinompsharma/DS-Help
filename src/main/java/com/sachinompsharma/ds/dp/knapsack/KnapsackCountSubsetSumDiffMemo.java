package com.sachinompsharma.ds.dp.knapsack;

public class KnapsackCountSubsetSumDiffMemo {

    public static int [][] memo = new int [102][1002];
    public static void main(String[] args) {

        int [] wt = {1, 2, 3, 1, 2};
        int diff = 1;
        int sum = 0;
        int n = wt.length;
        for (int w : wt) {
            sum += w;
        }

        int w =  ( sum + diff ) / 2;

        for (int i = 0; i <= n  ; i++) {
            for (int j = 0; j <= w ; j++) {
                memo[i][j] = -1;
            }
        }

        System.out.println(knapsack(wt,n, w));
    }

    public static int knapsack(int []wt, int n, int w) {

        if ( w == 0 )
            return memo[n][w] = 1;

        if ( n == 0)
            return memo[n][w] = 0 ;

        if ( memo[n][w] != -1)
            return memo[n][w];


        if ( wt[n-1] <= w){

            return memo[n][w] = knapsack(wt, n-1 , w- wt[n-1]) +
                    knapsack(wt, n-1, w);

         }
        else {
            return memo[n][w] = knapsack(wt, n-1 , w);
        }

    }
}
