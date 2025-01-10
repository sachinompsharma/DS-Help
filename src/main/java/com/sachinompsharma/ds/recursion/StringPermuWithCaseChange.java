package com.sachinompsharma.ds.recursion;

import java.sql.SQLOutput;

public class StringPermuWithCaseChange {
    public static void main(String[] args) {
        String in ="ab",out = "";
        solve(in,out);
    }

    public static void solve(String in, String out) {
        if(in.isEmpty()){
            System.out.println(out);
            return;
        }

        String op1 = out + (in.charAt(0)+"").toUpperCase();
        String op2 = out + in.charAt(0);
        in = in.substring(1);
        solve(in,op1);
        solve(in,op2);
    }
}
