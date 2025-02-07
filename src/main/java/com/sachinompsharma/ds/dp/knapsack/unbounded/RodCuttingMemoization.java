package com.sachinompsharma.ds.dp.knapsack.unbounded;

import java.util.stream.IntStream;

public class RodCuttingMemoization {

    public static int [][] memo = new int[102][1002];
    public static void main(String[] args) {
        int [] price =  {1, 5, 8, 9, 10, 17, 17, 20}; // val[]
        int capacity =  price.length;
        int [] wt = IntStream.rangeClosed(1, price.length).toArray();


        // Initialize the memo matrix.


        for (int i = 0; i <= price.length ; i++) {
            for (int j = 0; j <= capacity ; j++) {
                memo[i][j] = -1;
            }
        }

        System.out.println(unboundknapsackRodCutting(wt,price,capacity,capacity));
    }

    public static int unboundknapsackRodCutting(int [] wt, int [] price, int n, int capacity) {

        if ( n == 0 || capacity == 0 )
            return 0;

        if (memo [n][capacity] != -1)
            return  memo [n][capacity];

        if ( wt[n-1] <= capacity)
            return  memo [n][capacity] = Math.max(price[n-1] +  unboundknapsackRodCutting(wt,price, n, capacity - wt[n-1]),
                    unboundknapsackRodCutting(wt, price, n-1, capacity));

        else
            return  memo [n][capacity] = unboundknapsackRodCutting(wt, price, n-1 , capacity);

    }
}
