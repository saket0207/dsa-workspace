package org.kumar.basics.function;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d= sc.nextInt();
        int f = findDigitFrequency(n, d);
        System.out.println(f);
    }

    private static int findDigitFrequency(long n, int d) {
        int counter = 0;

        while(n != 0){
            long rem = n % 10;
            n = n / 10;
            if(rem == d){
                counter++;
            }
        }
        return counter;
    }
}
