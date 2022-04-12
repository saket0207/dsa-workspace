package org.kumar.basics.dynamicprogramming;

import java.util.Scanner;

public class StockSpanWithTwoTransaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        int [] prices = new int[n];
        System.out.println("Enter prices ");
        for(int i = 0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }
        int mpist = 0;
        int lsf = prices[0];
        int [] mpisut = new int[n];
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            mpist = prices[i] - lsf;
            if(mpist > mpisut[i - 1]){
                mpisut[i] = mpist;
            }else{
                mpisut[i] = mpisut[i - 1];
            }
        }
        int mpibt = 0;
        int [] mpibat = new int[n];
        int maxAt = prices[n-1];
        for(int i = prices.length - 2; i >= 0; i--){
            if(prices[i] > maxAt){
                maxAt = prices[i];
            }
            mpibt = maxAt - prices[i];
            if(mpibt > mpibat[i + 1]){
                mpibat[i] = mpibt;
            }else{
                mpibat[i] = mpibat[i + 1];
            }
        }
        int op = 0;
        for(int i = 0; i < n; i++){
            if(mpisut[i] + mpibat[i] > op){
                op = mpibat[i] + mpisut[i];
            }
        }
        System.out.println(op);
    }
}
