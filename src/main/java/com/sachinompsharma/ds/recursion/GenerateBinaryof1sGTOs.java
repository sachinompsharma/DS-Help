package com.sachinompsharma.ds.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryof1sGTOs {
    public static void main(String[] args) {
        int n = 3;
        int one = 0; int zero = 0;
        List<String> list = new ArrayList<>();
        String s = "";
        generate(one, zero, n, list,s);
        list.forEach(System.out::println);
        System.out.println("---------------------");
        n = 3; one = 0 ; zero = 0; List<String> list2 = new ArrayList<>();s = "";
        generate2(one, zero, n, list2,s);
        list.forEach(System.out::println);
    }

    public static void generate2(int one, int zero, int n, List<String> l, String s) {

        if ( 0 ==  n){
            l.add(s);
            return;
        }

        if ( one > zero){
            generate(one + 1, zero, n - 1, l,s + "1");
            generate(one, zero + 1, n - 1,l, s + "0");
        }

        if (one  == zero){
            generate(one + 1, zero, n -1 , l, s + "1");
        }
    }

    public static void generate(int one, int zero, int n, List<String> l, String s) {

        if ( (one + zero) ==  n){
            l.add(s);
            return;
        }

        if ( one > zero){
            generate(one + 1, zero, n, l,s + "1");
            generate(one, zero + 1, n ,l, s + "0");
        }

        if (one  == zero){
            generate(one + 1, zero, n , l, s + "1");
        }
    }


}
