package com.sachinompsharma.ds.dp.knapsack.ZeroOne;

public class KnapsackEqualPartitionSumTabulation {
    public static Boolean [][] dp = new Boolean[102][1002];
    public static void main(String[] args) {
        int [] arr = {1,5,12,5,2,1};

        System.out.println(equalSumPartition(arr));


    }

    public static boolean equalSumPartition(int [] arr ) {

        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= sum ; j++) {
                if( j == 0 )
                    dp[i][j] = false;

                if ( i == 0)
                    dp[i][j] = true;

            }
        }
        if ( sum % 2 != 0)
            return false;
        else
            return knapsack(arr, arr.length, sum / 2);

    }

    public static boolean knapsack(int [] wt, int n, int w) {

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=w ; j++) {

                if(wt[i-1] <= j){
                    dp[i][j] = dp [i-1][j-wt[i-1]] || dp [i-1][j];
                }
                else
                    dp[i][j] = dp[i-1][j];
            }

        }

        return  dp[n][w];
    }
}
