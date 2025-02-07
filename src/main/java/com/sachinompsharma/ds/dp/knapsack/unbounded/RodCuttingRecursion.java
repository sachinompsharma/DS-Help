package com.sachinompsharma.ds.dp.knapsack.unbounded;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RodCuttingRecursion {

    public static void main(String[] args) {
        int [] price =  {1, 5, 8, 9, 10, 17, 17, 20}; // val[]
        int capacity =  price.length;
        int [] wt = IntStream.rangeClosed(1, price.length).toArray();
        System.out.println(unboundknapsackRodCutting(wt,price,capacity,capacity));
    }

    public static int unboundknapsackRodCutting(int [] wt, int [] price, int n, int capacity) {

        if ( n == 0 || capacity == 0 )
            return 0;

        if ( wt[n-1] <= capacity)
            return  Math.max(price[n-1] +  unboundknapsackRodCutting(wt,price, n, capacity - wt[n-1]),
                    unboundknapsackRodCutting(wt, price, n-1, capacity));

        else
            return  unboundknapsackRodCutting(wt, price, n-1 , capacity);

    }
}
