package org.kumar.av.dynamicprogramming;

import java.util.Scanner;

public class StockSpanInfiniteTransaction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the prices");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int bd = 0, sd = 0, profit = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] <= arr[i]){
                sd++;
            }else{
                profit += arr[sd] - arr[bd];
                sd = bd = i;
            }
        }
        profit += arr[sd] - arr[bd]; // if data ends in high stock price
        System.out.println(profit);

    }
}
