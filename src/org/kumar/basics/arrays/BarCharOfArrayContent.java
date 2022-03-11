package org.kumar.basics.arrays;

import java.util.Scanner;

public class BarCharOfArrayContent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        printBarChart(arr);

    }

    private static void printBarChart(int[] arr) {
        int maxElementOfArray = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            maxElementOfArray = Math.max(maxElementOfArray, arr[i]);
        }
        int [] spArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            spArray[i] = maxElementOfArray - arr[i];
        }
        for(int j = maxElementOfArray-1; j >= 0; j--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= j) {
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
