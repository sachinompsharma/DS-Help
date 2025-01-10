package com.sachinompsharma.ds.recursion;

import java.net.StandardSocketOptions;

public class HanoiTower {

    public static void main(String ... args){
        int s = 1, h = 2, d = 3 , n =5;
        hanoiSolve(s,h,d,n);
    }

    public static void hanoiSolve(int s, int d, int h , int n){
        if( n == 1) {
            System.out.println(" ");
            System.out.printf(" Source  (%d) to Destination (%d) ", s, d);
            return;
        }

        hanoiSolve(s,h,d,n-1);
        hanoiSolve(h,d,s,n-1);
    }
}
