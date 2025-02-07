package com.sachinompsharma.ds.dp.knapsack.ZeroOne;

public class KnapsackEqualParitionSumRecursion {
    public static void main(String[] args) {
        int [] arr = {1,5,11,5};
        System.out.println(equalPartitionSum(arr));
    }

    public static boolean equalPartitionSum(int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

        if( sum % 2 != 0)
            return  false;
        else
            return knapsack(arr, arr.length, sum/2);

    }

    public static boolean knapsack(int []wt, int n, int w) {
        // Base Condition
        if ( w == 0 ) return true;
        if ( n == 0 ) return false;

        if ( wt[n-1] <= w){
            return knapsack(wt, n-1, w - wt[n-1]) ||
                    knapsack(wt, n-1, w);
        }
        else
            return  knapsack(wt, n-1, w);
    }
}
