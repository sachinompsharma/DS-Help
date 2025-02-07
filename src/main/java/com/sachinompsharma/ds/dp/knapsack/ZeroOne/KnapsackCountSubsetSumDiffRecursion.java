package com.sachinompsharma.ds.dp.knapsack.ZeroOne;

public class KnapsackCountSubsetSumDiffRecursion {

    public static void main(String[] args) {
        int [] arr = {5,2,6,4};
        int diff = 3;
        System.out.println(findCount(arr,diff));
    }

    public static int findCount(int [] wt, int diff) {
        int sum = 0;
        for(int i : wt){
            sum += i;
        }

        int w = ( diff + sum ) / 2;
        return knapsack(wt, wt.length, w);
    }

    public static int knapsack(int [] wt, int n, int w) {

        if ( w == 0 ) return 1;
        if ( n == 0 ) return 0;

        if (wt[n-1] <= w){
            return knapsack(wt, n - 1, w - wt[n-1]) +
                    knapsack(wt, n - 1, w);
        }
        else
            return  knapsack(wt, n - 1, w);

    }
}
