package org.kumar.basics.patterns;

import java.util.Scanner;
/*
Pattern 08
                *(1,5)
            *(2,4)
        *(3,3)
    *(4,2)
*(5,1)

*/

public class Pattern08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++) {
                if ((i + j) == (n + 1)) {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
