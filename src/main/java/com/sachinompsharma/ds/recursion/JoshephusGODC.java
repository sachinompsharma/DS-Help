package com.sachinompsharma.ds.recursion;

import java.util.ArrayList;
import java.util.List;

public class JoshephusGODC {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        generate(list,40);
        gofdc(list,7-1, 0);
    }
    public static void generate(List<Integer> list, int n){

        System.out.println("Array ..........");
        for(int i = 1 ;i <=n ; i++){
            System.out.println(i);
            list.add(i);

        }
        System.out.println("----------------------");
    }

    public static void gofdc(List<Integer> list, int k , int index ) {

        if (list.size() == 1){
            System.out.println("Last men: " + list.getFirst());
            return;
        }

        index = (index + k) % list.size();
        System.out.println(list.remove(index));
        gofdc(list,k,index);

    }
}
