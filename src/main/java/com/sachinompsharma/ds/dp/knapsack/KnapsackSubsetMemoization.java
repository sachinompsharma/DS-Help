package com.sachinompsharma.ds.dp.knapsack;

public class KnapsackSubsetMemoization {
    public static Boolean [][] memo = new Boolean [100][1002]; // take from constraints.
    public static void main(String[] args) {
        int [] wt = {2,3,7,8,10};
        int sum = 11;
        int n = wt.length;
        initialize(memo, false, wt.length, sum);
        System.out.println(knapsack(wt,n,sum));
    }

    public static void initialize(Boolean [][] memo, boolean val, int n, int w) {


        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <  w ; j++) {
                memo[i][j] = null;
            }
        }
    }
    public static boolean knapsack(int [] wt, int n, int w) {

        if ( w == 0 ) return true;
        if ( n == 0 ) return false;

        if (memo[n][w] != null)
            return memo[n][w];

        if ( wt[n-1] <= w)
            return memo[n][w] = knapsack(wt,n-1, w-wt[n-1]) ||
                    knapsack(wt,n-1, w);
        else
            return  memo[n][w] = knapsack(wt, n-1, w);
    }
}
