package com.sachinompsharma.ds.recursion;

import java.sql.SQLOutput;

public class SubSets {
    public static  void main(String ...args){
        String in  = "";
        String out = "";
        subsets("abc" , "");

    }

    public static void subsets(String in, String out){
        if(in.isEmpty()){
            System.out.println(" out : " + out);
            return;
        }

        String op1  = out;
        String op2 = out + in.charAt(0);
        in = in.substring(1);

        subsets(in,op1);
        subsets(in,op2);
    }

}
