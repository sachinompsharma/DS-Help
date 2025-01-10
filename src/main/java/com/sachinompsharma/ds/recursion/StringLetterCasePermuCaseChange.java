package com.sachinompsharma.ds.recursion;

public class StringLetterCasePermuCaseChange {
    public static void main(String[] args) {
        solve("a1B2","");
    }

    public static void solve(String in, String out) {

        if(in.isEmpty()){
            System.out.println(out);
            return;
        }

        char ch = in.charAt(0);

        if(Character.isDigit(ch)){
            String op = out + ch;
            in = in.substring(1);
            solve(in,op);
        }
        else{
            String op1 = out + Character.toUpperCase(ch);
            String op2 = out + Character.toLowerCase(ch);
            in = in.substring(1);
            solve(in,op1);
            solve(in,op2);
        }
    }
}
