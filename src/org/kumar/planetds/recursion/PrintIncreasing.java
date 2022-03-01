package org.kumar.planetds.recursion;

import java.util.Scanner;

public class PrintIncreasing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        printIncreasing(n);
    }

    private static void printIncreasing(int n) {
        if(n == 0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
