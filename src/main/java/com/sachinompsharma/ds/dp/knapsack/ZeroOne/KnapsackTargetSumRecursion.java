package com.sachinompsharma.ds.dp.knapsack.ZeroOne;

public class KnapsackTargetSumRecursion {

    public static void main(String[] args) {
        /*
        Input : N = 5, arr[] = {1, 1, 1, 1, 1}, target = 3
        Output: 5
         Explanation:
        There are 5 ways to assign symbols to
        make the sum of array be target 3.


               // -1 + 1 + 1 + 1 + 1 = 3
               // +1 – 1 + 1 + 1 + 1 = 3
               // +1 + 1 – 1 + 1 + 1 = 3
               // +1 + 1 + 1 – 1 + 1 = 3
               //  +1 + 1 + 1 + 1 – 1 = 3

       */

        int [] wt = { 1, 1, 1, 1, 1 };
        int target = 3;

        int sum = 0;
        for (int i : wt) {
            sum += i;
        }
        int n = wt.length;
        int w = ( target + sum ) / 2;
        System.out.println(knapsack(wt,n,w));
    }

    public static int knapsack(int [] wt, int n, int w) {

        if ( w == 0 ) return 1;
        if ( n == 0 ) return 0;

        if ( wt[n-1] <= w)
            return knapsack(wt,n-1, w-wt[n-1]) +
                    knapsack(wt, n-1, w);
        else
            return  knapsack(wt, n-1, w);
    }
}
