package org.kumar.planetds.recursion;

import java.util.Scanner;

public class TargetSumSubsets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter array elements ");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target ");
        int tar = sc.nextInt();

        printTargetSumSubsets(arr, 0, "", 0, tar);
    }

    private static void printTargetSumSubsets(int[] arr, int index, String subset, int sumOfSet, int tar) {

        if(index == arr.length){
            if(sumOfSet == tar){
                System.out.println(subset + ". ");
            }
            return;

        }
        printTargetSumSubsets(arr, index + 1, subset + arr[index] + ", ", sumOfSet + arr[index], tar);
        printTargetSumSubsets(arr, index + 1, subset, sumOfSet, tar);

    }
}
