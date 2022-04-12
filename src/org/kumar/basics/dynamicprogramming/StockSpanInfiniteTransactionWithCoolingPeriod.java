package org.kumar.basics.dynamicprogramming;

import java.util.Scanner;

public class StockSpanInfiniteTransactionWithCoolingPeriod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int [] prices = new int[n];
        System.out.println("Enter prices");
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        int obsp = -prices[0];
        int ossp = 0;
        int ocsp = 0;

        for(int i = 1; i < prices.length; i++){
            int nbsp = 0, nssp = 0, ncsp = 0;
            if(ocsp - prices[i] > obsp){
                nbsp = ocsp - prices[i];
            }else{
                nbsp = obsp;
            }
            if(obsp + prices[i] > ossp){
                nssp = obsp + prices[i];
            }else{
                nssp = ossp;
            }
            if(ossp > ocsp){
                ncsp = ossp;
            }else{
                ncsp = ocsp;
            }
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        System.out.println(ossp);
    }
}
