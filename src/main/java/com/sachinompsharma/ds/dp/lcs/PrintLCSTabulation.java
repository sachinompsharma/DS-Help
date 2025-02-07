package com.sachinompsharma.ds.dp.lcs;

public class PrintLCSTabulation {

    public static int [][] dp = new int[1002][1003];
    public static void main(String[] args) {
        String f = "acbcf", s = "abcdaf";
        int m = f.length(), n = s.length();
        dp =lcsMat(f,s,m,n);
        System.out.println(lcsString(f,s,m,n));
    }

    public static int [][] lcsMat(String f, String s, int m, int n) {

        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {

                if ( f.charAt( i -1) ==  s.charAt( j -1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return  dp;
    }


    public static String lcsString(String f, String s, int m, int n){

        int i = m , j = n;
        String result= "";
        while (i > 0 && j > 0){

            if (f.charAt(i-1) == s.charAt(j-1)){
                result = f.charAt(i-1) + result;
                i--;j--;
            }
            else{
                if( dp[i-1][j] > dp[i][j-1])
                    i--;
                else
                    j--;
            }
        }
        return result;
    }
}
