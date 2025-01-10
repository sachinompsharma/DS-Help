package com.sachinompsharma.ds.recursion;

public class SortArray{

    public static void main(String ... args){
        int []nums = new int []{4,1,0,6,3,2,8,9};

        for( int n : nums){
            System.out.print(n + " ");
        }
        sort(nums, nums.length-1);
        System.out.println("After sorting\n\n\n");
        for( int n : nums){
            System.out.print(n  + "   ");
        }

    }


    public static void sort (int []n , int length){

        if (length == 0)
            return;

        int element = n[length];
        sort(n, length-1);
        insert(n, length , element);

    }


    public static void insert( int [] p , int length, int element){

        if(length == 0 || p[length-1] <= element){
            p[length] = element;
            return;
        }

        int temp = p[length-1];
        insert( p, length-1 , element);
        p[length] = temp;
    }
}

