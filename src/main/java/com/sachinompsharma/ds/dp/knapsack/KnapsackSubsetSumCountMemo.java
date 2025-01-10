package com.sachinompsharma.ds.dp.knapsack;

public class KnapsackSubsetSumCountMemo {

    static int [][] memo = new int[102][1002];
    public static void main(String[] args) {
        int [] wt = {2,3,7,8,10,11,10,10,5};
        int sum = 10;
        int n = wt.length;

        //Initialize the memo
        for (int i = 0; i <=n  ; i++) {
            for (int j = 0; j <=sum ; j++) {
                memo [i][j] = -1;
            }
        }
        System.out.println(knapsack(wt,n,sum));
    }

    public static int knapsack(int [] wt, int n, int w){

        if ( w == 0 ) return 1;
        if ( n == 0 ) return 0;

        if( memo[n][w] != -1)
            return  memo[n][w];

        if (wt[n-1] <= w)
            return  memo[n][w] = knapsack(wt,n-1, w - wt[n-1]) +
                    knapsack(wt, n-1 , w);
        else
            return  memo[n][w] = knapsack(wt,n-1, w);

    }
}
