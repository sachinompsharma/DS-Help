package com.sachinompsharma.ds.dp.knapsack.unbounded;

public class CoinChangeMinNoOfCoinsRecursion {

    public static void main(String[] args) {
        int [] coins = {9, 6, 5, 1} ;
        int sum = 19;

        // second case
        //int [] coins = {4, 6, 2};
        //int sum = 5;
        int n = coins.length;
        int ans = solve(coins, n, sum);
        System.out.println( ans != Integer.MAX_VALUE -1 ? ans : -1);
    }


    public static int solve(int [] coins, int n, int sum){

        if ( n == 0 )
            return Integer.MAX_VALUE -1;
        if ( sum == 0 )
            return 0;


        if ( coins[n-1] <= sum){
            return Math.min( 1+ solve(coins, n, sum - coins[n-1]),
                    solve(coins, n-1, sum));
        }

        else
            return solve(coins,n-1,sum);


    }


}
