package com.sachinompsharma.ds.dp.lcp;

import java.util.Arrays;

public class LCPTabulation {
    public static int [][] dp =  new int[102][104];

    public static void main(String[] args) {
        String s = "agbcba";
        System.out.println(lcp(s));
    }

    public static int lcp(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int m = s.length();
        int n = s2.length();
        return lcs(s,s2,m,n);

    }
    public static int lcs(String s1, String s2, int m, int n) {
        for (int i = 1; i <=m  ; i++) {
            for (int j = 1; j <=n  ; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}
