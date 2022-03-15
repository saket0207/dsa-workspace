package org.kumar.basics.function;

import java.util.Scanner;

public class MultiplicationAnyBase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter base of the two");
        int base = sc.nextInt();
        int mul = multiplyAnyBase(n, m, base);
        System.out.println(mul);
    }

    private static int multiplyAnyBase(int n, int m, int base) {
        int mul = 0, carry = 0;

        /*while(m != 0){
            int rem1 = m % 10;
            int temp = n;
            while(temp != 0){
                int rem2 = temp % 10;
                int mul1 = rem2 * rem1;
                carry = mul1 / base;
                int mulOutput = mul1 % base;
                mul =
            }
        }*/
        return mul;
    }
}
