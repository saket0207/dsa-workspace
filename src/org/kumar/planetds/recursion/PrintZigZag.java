package org.kumar.planetds.recursion;

import java.util.Scanner;

public class PrintZigZag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pizz(n);
    }

    private static void pizz(int n) {

        if(n == 0){
            return;
        }
        System.out.println("Pre " + n);
        pizz(n-1);
        System.out.println("In " + n);
        pizz(n-1);
        System.out.println("Post " + n);
    }
}
