package com.sachinompsharma.ds.dp.lcs;

public class LcsTabulation {

    public static int [][] dp =  new int[100][100];
    public static void main(String[] args) {
        //String s1 = "ab";
        //String s2 = "abcdkjddkfjklds";

       // String s1 = "abcdefgh";
       // String s2 = "acdefigh";

        String s1 = "acbcfadbaba", s2 = "abcdafadpopa";
        System.out.println(lcs(s1,s2,s1.length(),s2.length()));

    }

    public static int lcs(String s1, String s2, int m, int n) {

        int max =0;
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {

                if ( s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = 1 + dp [i-1][j-1];
                    max = Math.max(max,dp[i][j]);
                }

                else
                    dp[i][j] = 0;

            }
        }
        return max;
    }
}
