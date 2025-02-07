package com.sachinompsharma.ds.dp.lcs;

public class PrintLCSMemoization {

    public static String [][] memo = new String[1002][1003];
    public static void main(String[] args) {
        String f = "AGGTABBKA", s = "GXTXAYBYABBA";
        int m = f.length(), n = s.length();
        System.out.println(lcs(f,s,m,n));
    }

    public static String lcs(String f, String s, int m, int n){

        if (m == 0 || n == 0)
            return "";

        if(memo[m][n] != null && !memo[m][n].isEmpty())
            return memo[m][n];

        if (f.charAt(m-1) == s.charAt(n-1)){

            return memo[m][n] =
                    lcs(f,s,m-1,n-1) + f.charAt(m-1) ;
        }
        else{

            return memo[m][n] = (maxByLength(lcs(f,s,m-1,n),
                    lcs(f,s,m,n-1)));

        }
    }

    private static String maxByLength(String a, String b) {

        return a.length() > b.length() ? a : b;
    }
}
