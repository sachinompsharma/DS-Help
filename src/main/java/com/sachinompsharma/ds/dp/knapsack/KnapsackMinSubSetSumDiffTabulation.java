package com.sachinompsharma.ds.dp.knapsack;

import java.util.ArrayList;
import java.util.List;

public class KnapsackMinSubSetSumDiffTabulation {

    public static void main(String[] args) {
       int [] wt = {5, 3, 7};
        System.out.println(findMin(wt));
    }

    public static int findMin(int [] wt) {
        int n = wt.length;
        int sum = 0;

        for (int j : wt) {
            sum += j;
        }

        Boolean [][] dp = knapsack(wt,n,sum);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= sum/2 ; i++) {
           if ( dp[n][i] )
               list.add(i);

        }

        int min = Integer.MAX_VALUE;

        for(int i : list){
            min = Math.min(min, sum - 2 * i);
        }

        return min;

    }
    static Boolean [][] dp = new Boolean[102][1003];
    public static Boolean [][] knapsack(int [] wt, int n , int w) {

      // Initialization step

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= w ; j++) {
                if ( i  == 0 )
                    dp [i][j] = false;
                if ( j == 0)
                    dp [i][j] = true;
            }
        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=w ; j++) {

                if (wt[i-1] <= j){

                    dp [i][j] = dp [i-1][j-wt[i-1]] || dp [i-1][j];
                }
                else
                    dp [i][j] = dp [i-1][j];
            }

        }
        return dp;
    }
}
