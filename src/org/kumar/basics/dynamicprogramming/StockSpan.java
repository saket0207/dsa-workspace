package org.kumar.basics.dynamicprogramming;

import java.util.Scanner;

public class StockSpan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stock");
        int n = sc.nextInt();
        int [] prices = new int[n];
        System.out.println("Enter stock prices");
        for(int i = 0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }
        int leastValueSoFar = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profitSoFar = 0;

        for(int i = 0; i < prices.length; i++){

            if(prices[i] < leastValueSoFar){
                leastValueSoFar = prices[i];
            }
            profitSoFar = prices[i] - leastValueSoFar;
            if(overallProfit < profitSoFar){
                overallProfit = profitSoFar;
            }
        }
        System.out.println(overallProfit);
    }
}
