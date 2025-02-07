package com.sachinompsharma.ds.dp.lcs;

public class PrintLCSRecursion {

    public static int [][] dp = new int[1002][1003];
    public static void main(String[] args) {
        String f = "AGGTABBKA", s = "GXTXAYBYABBA";
        int m = f.length(), n = s.length();
        System.out.println(lcs(f,s,m,n));
    }

    public static String lcs(String f, String s, int m, int n){

        if (m == 0 || n == 0)
            return "";

        if (f.charAt(m-1) == s.charAt(n-1)){

            return lcs(f,s,m-1,n-1) + f.charAt(m -1) ;
        }
        else{

            return (maxByLength(lcs(f,s,m-1,n),lcs(f,s,m,n-1)));

        }

    }

    private static String maxByLength(String a, String b) {
        return a.length() > b.length() ? a : b;
    }
}
