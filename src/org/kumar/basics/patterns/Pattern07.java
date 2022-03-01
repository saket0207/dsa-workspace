package org.kumar.basics.patterns;

import java.util.Scanner;

public class Pattern07 {
/*
Pattern 07
*
    *
        *
            *
                *
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        int sp = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            System.out.println("*\t");
            sp++;

        }


    }
}
