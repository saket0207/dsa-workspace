package org.kumar.basics;

import java.util.Scanner;

public class GCDAndLCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rem = 0;
        int on1 = n1, on2 = n2;
        while (n1 != 0){
            rem = n2 % n1;
            n2 = n1;
            n1 = rem;

        }
        System.out.println(n2);
        int lcm = on1 * on2 / n2;
        System.out.println(lcm);
    }
}
