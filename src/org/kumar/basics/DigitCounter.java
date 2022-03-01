package org.kumar.basics;

import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        long number = sc.nextLong();
        int digitCount = countDigitsInNumber(number);
        System.out.println(digitCount);
    }

    private static int countDigitsInNumber(long number) {
        int count = 0;
        while(number != 0){
            number = number/10;
            count++;
        }
        return count;

    }
}
