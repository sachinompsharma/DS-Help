package com.sachinompsharma.ds.dp.lcp;

import java.util.Arrays;

public class LCPMemoization {
    public static int [][] memo =  new int[102][104];

    public static void main(String[] args) {
        String s = "agbcba";
        System.out.println(lcp(s));
    }
    public static void init(int m, int n){
        for(int [] arr : memo)
            Arrays.fill(arr, -1);
    }
    public static int lcp(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int m = s.length();
        int n = s2.length();
        init(m,n);
        return lcs(s,s2,m,n);

    }
    public static int lcs(String s1, String s2, int m, int n) {
        if(m == 0 || n == 0)
            return 0;

        if (s1.charAt(m-1) == s2.charAt(n-1))
            return memo[m][n] = 1 + lcs(s1,s2,m-1, n-1);

        else
            return memo[m][n] = Math.max(lcs(s1,s2,m-1,n),
                    lcs(s1,s2,m,n-1));
    }
}
