package org.kumar.basics.patterns;

import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for(int i = 0; i < n; i++){
            for(int k = 0; k < i; k++){
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
