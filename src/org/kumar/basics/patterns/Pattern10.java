package org.kumar.basics.patterns;

import java.util.Scanner;

public class Pattern10 {
/*
Pattern 10
        *
    *		 *
*   		      *
    *		 *
         *

     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        int os = n/2, in = -1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j = 1; j <= in; j++){
                System.out.print("\t");
            }
            if(i > 1 && i < n){
                System.out.print("*\t");
            }
            System.out.println();
            if(i <= n/2){
                os--;
                in += 2;
            }else{
                os++;
                in -= 2;
            }

        }
    }
}
