package com.sachinompsharma.ds.dp.knapsack.ZeroOne;

public class KnapsackSubsetSumwithRec {

    public static void main(String[] args) {
        int [] wt = {2,3,7,8,10};
        int sum = 11;
        int n = wt.length;
        System.out.println(knapsack(wt,n,sum));
    }

    public static boolean knapsack( int [] wt, int n, int sum) {

        if ( sum == 0 ) return true;
        if ( n == 0 ) return false;

        if ( wt[n-1] <= sum){
            return knapsack(wt,n-1 , sum- wt[n-1]) ||
                    knapsack(wt,n-1, sum);
        }
        else
            return knapsack(wt,n-1, sum);
    }
}
