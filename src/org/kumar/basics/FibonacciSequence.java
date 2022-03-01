package org.kumar.basics;

import java.util.Scanner;

public class FibonacciSequence {
// 0 1 1 2 3 5 8 13 21 34 55
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int end = sc.nextInt();
        int a = 0, b = 1;
        for(int i = 0; i < end; i++){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
