package com.sachinompsharma.ds.dp.lcs;

import java.util.Arrays;

public class ShortestCommonSupersequenceTabulation {

    public static int [][] dp = new int[102][105];
    public static int scs(String s1, String s2, int m, int n) {
        return (m+n) - lcs(s1,s2,m,n);

    }

    public static int lcs(String s1, String s2, int m ,int n) {
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {

                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return dp[m][n];

    }

    public static void main(String[] args) {
        //String s1= "GEEK";
        //String s2 = "EKE";

        String s1= "AGGTAB";
        String s2 = "GXTXAYB";
        int m = s1.length(); int n = s2.length();
        System.out.println(scs(s1,s2,m,n));

    }
}
