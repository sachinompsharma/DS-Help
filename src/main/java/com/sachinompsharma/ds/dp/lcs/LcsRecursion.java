package com.sachinompsharma.ds.dp.lcs;

public class LcsRecursion {

    public static void main(String[] args) {
        String s1 = "xyzabcd";
        String s2 = "abcdxyz";
        System.out.println(lcs(s1,s2,s1.length(),s2.length(),0));


    }

    public static int lcs(String s1, String s2, int m, int n, int count) {

        int max =0 ;
        if (m == 0 || n ==0 )
            return count;

        if ( s1.charAt(m-1) == s2.charAt(n-1))
            count =  lcs(s1,s2, m-1, n-1,count + 1);
        else
             max= Math.max( lcs(s1,s2, m-1, n,0),
                    lcs(s1,s2, m, n-1,0));
        return Math.max(count,max);
    }
}
