package com.sachinompsharma.ds.dp.lcs;

public class ShortestCommonSupersequenceRecursion {

    public static int scs(String s1, String s2, int m, int n) {
        return (m+n) - lcs(s1,s2,m,n);

    }

    public static int lcs(String s1, String s2, int m ,int n) {

        if (m == 0 || n == 0)
            return 0;

        if (s1.charAt(m-1) == s2.charAt(n-1))
            return 1 + lcs(s1,s2, m-1, n-1);
        else
            return Math.max(lcs(s1,s2,m-1,n),
                    lcs(s1,s2,m,n-1));

    }

    public static void main(String[] args) {
        //String s1= "GEEK";
        //String s2 = "EKE";

        String s1= "AGGTAB";
        String s2 = "GXTXAYB";
        int m = s1.length(); int n = s2.length();
        System.out.println(scs(s1,s2,m,n));
        System.out.println(scsWithoutLCS(s1,s2,m,n));

    }

    public static int scsWithoutLCS(String s1, String s2, int m, int n) {

        if ( m == 0 || n == 0)
            return m + n;

        if (s1.charAt(m-1) == s2.charAt(n-1))
            return 1 + scsWithoutLCS(s1,s2,m-1,n-1);
        else
            return 1 + Math.min(scsWithoutLCS(s1,s2,m-1,n),
                    scsWithoutLCS(s1,s2,m,n-1));

    }
}
