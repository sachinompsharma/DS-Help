package com.sachinompsharma.ds.dp.knapsack.unbounded;

import java.util.stream.IntStream;

public class RodCuttingTabulation {

    public static int [][] dp = new int [102][10003];
    public static void main(String[] args) {
        int [] price =  {1, 5, 8, 9, 10, 17, 17, 20}; // val[]
        int capacity =  price.length;
        int [] wt = IntStream.rangeClosed(1, price.length).toArray();

        //dp mat intialization.
        for (int i = 0; i <= price.length; i++) {
            for (int j = 0; j <= capacity ; j++) {
                if ( i == 0 || j == 0 )
                    dp [i][j] = 0;
            }
        }

        System.out.println(unboundknapsackRodCutting(wt,price,capacity,capacity));
    }

    public static int unboundknapsackRodCutting(int [] wt, int [] price, int n, int capacity) {

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= capacity ; j++) {

                if ( wt[i-1] <= j)
                    dp[i][j] = Math.max(price[i-1]+ dp[i][j - wt[i-1]],
                            dp[i-1][j]);

                else
                    dp[i][j] = dp[i-1][j];
            }
        }

       return dp[n][capacity];

    }
}
