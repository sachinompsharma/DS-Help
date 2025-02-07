package com.sachinompsharma.ds.dp.lcs;

public class LcSubstringTabulation {
    public static int [][] dp = new int[100][100];
    public static void main(String[] args) {

        String s1 = "abcdefgh";
        String s2 = "acdefigh";
        init(s1.length(),s2.length());
        System.out.println(lcSubstring(s1,s2,s1.length(),s2.length()));

    }
    public static void init( int m, int n){
        for (int i = 0; i <=m ; i++) {
            for (int j = 0; j <=n ; j++) {
               if ( i == 0 || j == 0  )
                   dp[i][j] = 0 ;
            }
        }
    }

    public static int lcSubstring(String s1, String s2, int m, int n) {

        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {

                if (s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = 0;
            }
        }
        return  dp[m][n];
    }
}
