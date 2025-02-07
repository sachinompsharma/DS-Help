package com.sachinompsharma.ds.dp.lcs;

public class MinNoOfDeletionNInsertionFromATOBRecursion {
    public static void mdmi(String s1,String s2, int m, int n) {
        int lcs = lcs(s1,s2,m,n);
        int del = m - lcs(s1,s2,m,n);
        int in = n - lcs(s1,s2,m,n);
        System.out.println(" No of Deletion = " + del + "  No of insertion = " + in);
    }

    public static int lcs(String s1, String s2, int m, int n) {

        if ( m == 0 || n == 0 )
            return  0;

        if ( s1.charAt(m-1) == s2.charAt(n-1) )
            return  1 + lcs(s1,s2, m - 1, n - 1 );
        else
            return Math.max(lcs(s1,s2, m-1, n),
                    lcs(s1, s2, m, n -1));

    }

    public static void main(String[] args) {
        String s1 = "heap";
        String s2 = "ea";

        int m = s1.length(); int n = s2.length();
        mdmi(s1,s2,m,n);
    }

}
