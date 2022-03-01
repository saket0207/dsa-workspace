package org.kumar.basics;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class RotateNumber {

    public static void main(String[] args) {
        //27391

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        System.out.println("Enter rotation count ");
        int rCount = sc.nextInt();
        long rotatedNumber = rotateNumber(num, rCount);
        System.out.println(rotatedNumber);
    }

    private static long rotateNumber(int num, int rCount) {
        long rNumber, divisor, multiplier;
        int digitCount = getDigitCountOfNumber(num);
        if(rCount > digitCount){
            rCount %= digitCount;
        }


        int divisorIndex, multiplierIndex;
        if(rCount < 0){
            divisorIndex = digitCount - (abs(rCount) % digitCount);
            multiplierIndex = abs(rCount) % digitCount;

        }else {
            divisorIndex = rCount;
            multiplierIndex = digitCount - rCount;
        }
        divisor = (int) pow(10, divisorIndex);
        multiplier = (long) pow(10, multiplierIndex);
        long quotient = num / divisor;
        long remainder = num % divisor;
        rNumber = multiplier * remainder + quotient;
        return rNumber;
    }

    private static int getDigitCountOfNumber(int num) {
        int count = 0;
        while(num != 0){
            num = num/10;
            count++;
        }
        return count;
    }
}
