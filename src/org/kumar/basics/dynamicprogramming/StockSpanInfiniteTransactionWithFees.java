package org.kumar.basics.dynamicprogramming;

import java.util.Scanner;

public class StockSpanInfiniteTransactionWithFees {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the prices");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter fees");
        int fee = sc.nextInt();
        int obsp = -arr[0], ossp = 0;
        for(int i = 1; i < arr.length; i++){
            int nbsp = 0, nssp = 0;
            //bsp
            if(ossp - arr[i] > obsp){
               nbsp = ossp - arr[i];
            }else{
                nbsp = obsp;
            }
            //ssp
            if(arr[i] - fee + obsp > ossp){
                nssp = arr[i] - fee + obsp;
            }else{
                nssp = ossp;
            }
            obsp = nbsp;
            ossp = nssp;
        }
        System.out.println(ossp);
    }
}
