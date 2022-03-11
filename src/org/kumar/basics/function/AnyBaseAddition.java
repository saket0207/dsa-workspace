package org.kumar.basics.function;

import java.util.Scanner;

public class AnyBaseAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter their base");
        int base = sc.nextInt();
        int sum = anyBaseAdd(n, m, base);
        System.out.println(sum);

    }

    public static int anyBaseAdd(int n, int m, int base) {
        int sum = 0, power = 0, carry = 0;
        while(n != 0 && m != 0){
            int rem1 = n % 10;
            int rem2 = m % 10;
            int remSum = rem1 + rem2 + carry;
            int rem = (remSum >= base) ? remSum % base : remSum;

            sum += rem * Math.pow(10, power);
            if(power > 0) {
                carry = 0;
            }
            if (remSum >= base) {
                carry = 1;
            }

            power++;
            n /= 10;
            m /= 10;
        }
        if(carry > 0){
            sum += carry * Math.pow(10, power);
        }
        return sum;
    }
}
