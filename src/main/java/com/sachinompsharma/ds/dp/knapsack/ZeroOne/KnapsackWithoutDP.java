package com.sachinompsharma.ds.dp.knapsack.ZeroOne;

public class KnapsackWithoutDP {
    public static void main(String[] args) {
       int [] wt = new int[] {4, 5, 1};
       int [] val = new int[] {1, 2, 3};
       int w = 4;
        System.out.println(knapsack(wt,val,w,wt.length));
    }

    public static int knapsack(int [] wt, int [] val, int w, int n) {

        if ( n == 0 || w == 0)
            return 0;

        if( wt[n-1] <= w) {
            return Math.max(val[n - 1] + knapsack(wt, val, w - val[n - 1], n - 1),
                    knapsack(wt, val, w, n - 1));
        }
        else if (wt[n-1] < w){
            return knapsack(wt,val,w,n-1);
        }
        else
            return 0;
    }
}
