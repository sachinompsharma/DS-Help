package com.sachinompsharma.ds.dp.knapsack;

public class KnapsackEqualPartitionSumMemoization {

    public static Boolean [][] memo = new Boolean[102][1002];

    public static void main(String[] args) {
        int [] arr = {1,5,11,5,2};
        System.out.println(equalSumPartition(arr));

    }

    public static boolean equalSumPartition(int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

        if ( sum % 2 != 0)
            return false;

        for (int i = 0; i <= arr.length ; i++) {
            for (int j = 0; j <= sum/2 ; j++) {
                memo[i][j]  = null;
            }
        }
        return knapsack(arr, arr.length, sum / 2);
    }

    public static boolean knapsack(int [] wt, int n, int w) {

        if ( w == 0 ) return true;
        if ( n == 0 ) return false;

        if( memo[n][w] != null)
            return memo[n][w];

        if (wt[n-1] <= w){
            return  memo [n][w] =  knapsack(wt, n - 1, w - wt[n-1]) ||
                    knapsack(wt, n - 1, w )   ;
        }
        else
            return  memo[n][w] = knapsack(wt, n-1, w);
    }

}


