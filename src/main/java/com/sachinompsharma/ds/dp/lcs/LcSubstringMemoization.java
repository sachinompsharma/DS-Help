package com.sachinompsharma.ds.dp.lcs;

public class LcSubstringMemoization {
    public static int [][] memo = new int[100][100];
    public static void main(String[] args) {

        String s1 = "abcdefgh";
        String s2 = "acdoefigh";
        init(s1.length(),s2.length());
        System.out.println(lcSubstring(0,s1,s2,s1.length(),s2.length()));

    }
    public static void init( int m, int n){
        for (int i = 0; i <=m ; i++) {
            for (int j = 0; j <=n ; j++) {
                memo[i][j] = -1;
            }
        }
    }

    public static int lcSubstring(int max, String s1, String s2, int m, int n) {
        if( m == 0 || n == 0 )
            return 0;

        if( memo[m][n] != -1)
            return memo[m][n];


        if (s1.charAt(m-1) == s2.charAt(n-1))
            return memo[m][n] = max = Math.max( 1 + lcSubstring(max, s1,s2,m-1, n-1),max);
        else
            return memo[m][n] = 0;
    }
}
