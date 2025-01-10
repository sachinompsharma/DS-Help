package com.sachinompsharma.ds.dp.knapsack;

public class KnapsackSubsetsumCountRecursion {
    public static void main(String[] args) {
        int [] wt = {2,3,7,8,10,11};
        int sum = 10;
        int n = wt.length;
        System.out.println(knapsack(wt,n,sum));
    }

    public static int knapsack(int [] wt, int n, int w) {

        if ( w == 0 ) return 1;
        if( n == 0) return 0;




        if( wt[n-1] <= w){
            return knapsack(wt, n-1, w- wt[n-1]) +
                    knapsack(wt, n-1, w);
        }
        else{
            return knapsack(wt, n-1 , w);
        }
    }
}
