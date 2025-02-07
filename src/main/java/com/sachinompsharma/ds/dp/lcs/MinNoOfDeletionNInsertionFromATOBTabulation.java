package com.sachinompsharma.ds.dp.lcs;

import java.util.Arrays;

public class MinNoOfDeletionNInsertionFromATOBTabulation {

    public static int [][] dp = new int [102][102];
    public static void mdmi(String s1,String s2, int m, int n) {
        int lcs = lcs(s1,s2,m,n);
        int del = m - lcs(s1,s2,m,n);
        int in = n - lcs(s1,s2,m,n);
        System.out.println(" No of Deletion = " + del + "  No of insertion = " + in);
    }


    public static int lcs(String s1, String s2, int m, int n) {
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n ; j++) {

                if (s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "heap";
        String s2 = "Kpea";

        int m = s1.length(); int n = s2.length();
        mdmi(s1,s2,m,n);
    }

}
