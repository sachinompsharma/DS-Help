package com.sachinompsharma.ds.dp.knapsack;

public class KnapsackwithDP {


    static int [][] t = new int[100][100];
    public static void main(String[] args) {
        int [] val = {1, 2, 3};
        int [] weight = {4, 5, 1};
        int w = 4;
        int n = val.length;
        System.out.println(" Knapsack : ");

        System.out.println(knapsack(val,weight,w,n));
    }

    public static int knapsack(int [] val, int [] wt, int w, int n) {

        //initialization
        for (int i = 0; i < n+1 ; i++) {
            for (int j = 0; j < w+1 ; j++) {
               if (i == 0 || j == 0)
                   t[i][j] = 0;
            }

        }

        for (int i = 1 ; i < n+1 ; i++) {
            for (int j = 1 ; j < w+1 ; j++) {

                    if(wt[i-1] <= j){                   // w is also changing all the time i m doign mistake here by taking w in place of j
                        t[i][j] = Math.max(
                                ( val[i-1] + t[i-1][j-wt[i-1]] ),
                                t[i-1][j]);
                    }
                    else
                        t[i][j] = t[i-1][j];
            }
        }
        return t[n][w];

    }
}
