package com.sachinompsharma.ds.dp.knapsack;

import java.util.Arrays;

public class KnapsackWithMemoization {

    static int [] val = {1, 2, 3}; static int [] weight = {4, 5, 1};
    static int n = val.length;
    static int w = 4;
    public static int [][] memo = new int[n+1][w+1];
    public static void main(String[] args) {

        System.out.println("Memo value: ");

        fillMemo(memo,-1);
        Arrays.stream(memo)
                .flatMapToInt(Arrays::stream)
                .forEach(num -> System.out.print(num + " "));

        System.out.println("Knapsack result");
        System.out.println("Max profit: "+ knapsack(val,weight,w,n));

    }

    public static void fillMemo(int [][] memo, int value){

        for( int [] mem : memo){
            Arrays.fill(mem, value);
        }
    }

    public static int knapsack(int [] val, int [] wt, int w, int n) {

        if ( n == 0 || w == 0)
            return 0;

        if( memo[n][w] != -1)
            return memo[n][w];

        if( wt[n-1] <= w){
            return memo[n][w] = Math.max(val[n-1] + knapsack(val,wt,w-wt[n-1], n-1),
                    knapsack(val,wt,w,n-1));
        }
        else if ( wt[n-1] > w)
            return memo[n][w] = knapsack(val,wt,w,n-1);
        else
            return 0;
    }
}
