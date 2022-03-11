package org.kumar.basics.function;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter base of the two");
        int base = sc.nextInt();
        int sub = subtractAnyBase(n, m, base);
        System.out.println(sub);
    }

    private static int subtractAnyBase(int n, int m, int base) {

        int sub = 0, remSub, carry = 0, power = 0;
        if(n > m) {
            while (n != 0) {
                int rem1 = n % 10;
                int rem2 = m % 10;
                if (rem1 > rem2) {
                    remSub = carry + rem1 - rem2;
                    if(power == 0) {
                        carry = 0;
                    }
                } else {
                    remSub = carry + rem1 + base - rem2;
                    carry = -1;
                }
                sub += remSub * Math.pow(10, power);
                power++;
                n = n / 10;
                m = m / 10;
            }
        }
        return sub;
    }
}
