package com.sachinompsharma.ds.dp.lcp;

public class MinDeletiontoPalindromeRecursion {
    public static void main(String[] args) {
        String s = "agbcba";
        System.out.println(lcp(s));
    }

    public static int lcp(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int m = s.length();
        int n = s2.length();
        return m - lcs(s,s2,m,n);

    }
    public static int lcs(String s1, String s2, int m, int n) {
        if(m == 0 || n == 0)
            return 0;

        if (s1.charAt(m-1) == s2.charAt(n-1))
            return 1 + lcs(s1,s2,m-1, n-1);

        else
            return Math.max(lcs(s1,s2,m-1,n),
                    lcs(s1,s2,m,n-1));
    }
}
