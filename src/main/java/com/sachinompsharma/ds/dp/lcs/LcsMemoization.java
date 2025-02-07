package com.sachinompsharma.ds.dp.lcs;

import java.util.HashMap;

public class LcsMemoization {

    public static int [][] memo =  new int[100][100];
    public static void main(String[] args) {
        String s1 = "xyzabcdeg";
        String s2 = "abcdefg";
        System.out.println(lcs(s1,s2,s1.length(),s2.length(),0,new HashMap<>()));



    }

  //Memoization with HashMap

    public static int lcs(String s1, String s2, int m, int n , int count, HashMap<String, Integer> h) {
        int same = 0;

        if (m == 0 || n ==0 )
            return count;

        String key  = m + " - " + n +" - " + count;
        if ( h.containsKey(key))
            return h.get(key);

        if ( s1.charAt(m-1) == s2.charAt(n-1)) {

            same = lcs(s1, s2, m - 1, n - 1, count + 1, h);
        }

            int df1= lcs(s1,s2, m-1, n,0,h);
            int df2 =lcs(s1,s2, m, n-1,0,h);
            int result = Math.max(same, Math.max(df1,df2));
        h.put(key,result);
        return result;

    }
}
