package org.kumar.planetalg;

import java.util.Scanner;

public class FindMissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total count ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n-1; i++){
            arr[i] = sc.nextInt();
        }
        int missingNumber = findMissingNumber(n, arr);
        System.out.println("Missing number is " + missingNumber);
    }

    private static int findMissingNumber(int n, int[] arr) {

        int expectedSum = (n * (n+1))/2;
        int actualSum = 0;
        for(int i = 0; i < n-1; i++){
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }
}
