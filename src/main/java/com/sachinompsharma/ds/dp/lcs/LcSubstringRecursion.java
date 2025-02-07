package com.sachinompsharma.ds.dp.lcs;

public class LcSubstringRecursion {
    public static void main(String[] args) {

        String s1 = "abcdefgh";
        String s2 = "acdefigh";
        System.out.println(maxCommonSubString(0,s1,s2,s1.length(),s2.length()));

    }

    public static int lcSubstring(String s1, String s2, int m, int n) {
        if( m == 0 || n == 0 )   // optimized coding syntax     if ( m == 0 || n == 0 || s1.charAt(m-1) != s2.charAt(n-1) return 0
            return 0;

        if (s1.charAt(m-1) == s2.charAt(n-1))
            return 1 + lcSubstring(s1,s2,m-1, n-1);
        else
            return 0;
    }

    public static int maxCommonSubString( int max , String s1, String s2, int m, int n){

        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {

                max =  Math.max(max, lcSubstring(s1,s2,i,j));
            }

        }
        return max;
    }
}
