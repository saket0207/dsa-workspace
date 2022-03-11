package org.kumar.basics.arrays;

import java.util.Scanner;

public class SpanOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int span = calculateSpan(arr);
        System.out.println("Span = " + span);

    }

    private static int calculateSpan(int[] arr) {
        int span = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        span = max - min;
        return span;
    }
}
