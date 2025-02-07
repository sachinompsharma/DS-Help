package com.sachinompsharma.ds.dp.knapsack.ZeroOne;

public class KnapsackMinSubsetSumDiffRecursion {

    public static void main(String[] args) {

        int [] arr = {2,3,7};
        System.out.println(findMinSubsetSumDiff(arr));
    }

    public static int findMinSubsetSumDiff(int [] arr) {

        int n = arr.length;
        int sum = 0;

        for(int i = 0 ; i < n ;i++)
            sum += arr[i];

        return minDiff(arr, n, 0, sum);
    }

    public static int minDiff(int [] arr, int n, int wt, int w) {

        if ( n == 0 )
            return Math.abs(w- 2 * wt);

        return Math.min( minDiff(arr, n-1 ,wt + arr[n-1] ,w),
                minDiff(arr, n-1 , wt, w));
    }

}
