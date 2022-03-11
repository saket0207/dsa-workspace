package org.kumar.basics.function;

import java.util.Scanner;

import static java.lang.Math.*;

public class NumberConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Enter from base");
        int fromBase = sc.nextInt();
        System.out.println("Enter to base");
        int toBase = sc.nextInt();

        int num = numberConversionAnyBaseToAnyBase(number, fromBase, toBase);
        System.out.println(num);
    }

    private static int numberConversionAnyBaseToAnyBase(int number, int fromBase, int toBase) {
        int decimalBase = fromBaseToDecimal(number, fromBase);
        System.out.println(decimalBase);
        int finalNum = decimalToAnyBase(decimalBase, toBase);
        return finalNum;
    }
    private static int fromBaseToDecimal(int number, int base){
        int sum = 0, power = 0;
        while (number != 0){
            int rem = number % 10;
            sum += rem * pow(base, power);
            power++;
            number = number / 10;
        }
        return sum;

    }
    private static int decimalToAnyBase(int number, int toBase){
        int sum = 0, power = 0;
        while (number != 0){
            int rem = number % toBase;
            sum += rem * pow(10, power);
            power++;
            number = number / toBase;
        }
        return sum;
    }

}
