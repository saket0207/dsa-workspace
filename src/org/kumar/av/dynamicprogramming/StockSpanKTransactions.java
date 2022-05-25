package org.kumar.av.dynamicprogramming;

import java.util.Arrays;

public class StockSpanKTransactions {
    public static void main(String[] args) {
        int [][] arr = new int[4][4];
        for(int [] ar : arr){
            Arrays.fill(ar, 1);
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
