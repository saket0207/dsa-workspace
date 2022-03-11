package org.kumar.basics.patterns;

import java.util.Scanner;

public class Pattern14 {
    /*
    * Table in format X * 1 = X
    * */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " * " + i + " = " + (i*n));
        }
    }
}
