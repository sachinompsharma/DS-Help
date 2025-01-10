package com.sachinompsharma.ds.dp.knapsack;

public class KnapsackMinSubsetSumDiffMemoization {

    static int [][] memo = new int [102][1002];
    public static void main(String[] args) {

        int [] arr = {1,3,7};

        // int [][] memo = new int [arr.length + 1][ sum of array + 1];
        System.out.println(findMinSubsetSumDiff(arr));
    }

    public static int findMinSubsetSumDiff(int [] arr) {

        int n = arr.length;
        int sum = 0;

        for(int i = 0 ; i < n ;i++)
            sum += arr[i];

        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <= sum ; j++) {
                memo[i][j] = -1;
            }

        }

        return minDiff(arr, n, 0, sum);
    }

    public static int minDiff(int [] arr, int n, int wt, int w) {

        if ( n == 0 )
            return memo[n][wt] = Math.abs(w- 2 * wt);

        if ( memo[n][wt] != -1)
            return memo[n][wt];
        return memo[n][wt] =  Math.min( minDiff(arr, n-1 ,wt + arr[n-1] ,w),
                minDiff(arr, n-1 , wt, w));
    }

}
