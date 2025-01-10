package com.sachinompsharma.ds.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateBalancedParanethesis {
    public static void main(String[] args) {
        int n = 3;
        String s = "";
        List<String> list = new ArrayList<>();
        solve(n,n,list,s);
        list.forEach(System.out::println);
    }

    public static void solve(int o, int c, List<String> list, String s) {

        if ( o == 0 && c == 0 ){
            list.add(s);
            return;
        }

         if ( o != 0){
            solve(o - 1,c,list,s + "(");
        }
        if(c > o) {
            solve(o,c - 1,list,s + ")");   // Note c =  c -1 will reduce two times as it will work in method call also
            //and in the next method body also we have to reduce the value for the function call only so pass
            // in the calling function only.
        }
    }
}
