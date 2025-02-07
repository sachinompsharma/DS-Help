package com.sachinompsharma.ds.dp.lcs;

import java.util.Arrays;

public class ShortestCommonSupersequenceMemoization {

    public static int [][] memo = new int[102][105];
    public static int scs(String s1, String s2, int m, int n) {
        return (m+n) - lcs(s1,s2,m,n);

    }

    public static void init(int m, int n) {
        for( int [] arr : memo)
            Arrays.fill(arr,-1);
    }
    public static int lcs(String s1, String s2, int m ,int n) {

        if (m == 0 || n == 0)
            return 0;

        if(memo[m][n] != -1)
            return memo[m][n];

        if (s1.charAt(m-1) == s2.charAt(n-1))
            return memo[m][n] =  1 + lcs(s1,s2, m-1, n-1);
        else
            return memo[m][n] = Math.max(lcs(s1,s2,m-1,n),
                    lcs(s1,s2,m,n-1));

    }

    public static void main(String[] args) {
        //String s1= "GEEK";
        //String s2 = "EKE";

        String s1= "AGGTABOP";
        String s2 = "GXTXAYBOP";
        int m = s1.length(); int n = s2.length();
        init(m,n);
        System.out.println(scs(s1,s2,m,n));

    }
}
