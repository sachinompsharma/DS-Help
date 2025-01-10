package com.sachinompsharma.ds.recursion;

public class StringPermutationWithSpaces {
    public static void main(String[] args) {
        String in = "ABC";
        String out = in.charAt(0)+"";
        solve(in.substring(1),out);
    }

    public static void solve(String in, String out){

        if ( in.isEmpty()){
            System.out.println(out);
            return;
        }

        String op1 = out + " " + in.charAt(0);
        String op2 = out + in.charAt(0);
        in = in.substring(1);
        solve(in,op1);
        solve(in,op2);
    }
}
