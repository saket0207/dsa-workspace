package org.kumar.basics.patterns;

import java.util.Scanner;

public class Pattern06 {
/*
Pattern 06
*   *   *       *   *   *
*   *               *   *
*                       *
*   *               *   *
*   *   *       *   *   *

*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        int sp = 1, st = n/2+1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
            if(i <= n/2) {
                sp += 2;
                st--;
            }else{
                sp -=2;
                st++;
            }

            System.out.println();
        }
    }
}
