package org.kumar.planetds.recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int factnm1 = factorial(n-1);
        int fact = n * factnm1;
        return fact;
    }
}
