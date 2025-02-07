package com.sachinompsharma.ds.dp.knapsack.unbounded;

public class UnBoundKnapSackRecursion {

    public static void main(String[] args) {
        int capacity = 8, val []  = {10, 40, 50, 70}, wt[] = {1, 3, 4, 5};

        System.out.println(knapsack(wt,val,val.length,capacity));
    }

    public static int knapsack(int [] wt, int [] val, int n, int w) {

        if ( n == 0 ||  w  == 0 )
            return 0;

        if ( wt[n-1] <= w){

            return Math.max(val[n-1] + knapsack(wt,val,n, w -wt[n-1]),
                    knapsack(wt,val, n-1, w));
        }
        else
            return  knapsack(wt,val, n-1, w);

    }
}
