package org.kumar.basics.patterns;

import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int j = 1;
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= i; k++){
                System.out.print(j++);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
