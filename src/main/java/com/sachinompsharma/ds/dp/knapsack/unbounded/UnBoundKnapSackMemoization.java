package com.sachinompsharma.ds.dp.knapsack.unbounded;

public class UnBoundKnapSackMemoization {

    public static int [][] memo = new int[102][1002];
    public static void main(String[] args) {
        int capacity = 8, val []  = {10, 40, 50, 70}, wt[] = {1, 3, 4, 5};

        // Initialize the memo matrix

        for (int i = 0; i <= val.length ; i++) {
            for (int j = 0; j <= capacity ; j++) {
                memo [i][j] = -1;
            }
        }

        System.out.println(knapsack(wt,val,val.length,capacity));
    }

    public static int knapsack(int [] wt, int [] val, int n, int w) {

        if ( n == 0 ||  w  == 0 )
            return 0;

        if (memo[n][w] != -1)
            return memo[n][w];

        if ( wt[n-1] <= w){

            return memo[n][w] = Math.max(val[n-1] + knapsack(wt,val,n, w -wt[n-1]),
                    knapsack(wt,val, n-1, w));
        }
        else
            return  memo[n][w] = knapsack(wt,val, n-1, w);

    }
}
