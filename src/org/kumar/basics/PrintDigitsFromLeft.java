package org.kumar.basics;

import java.util.Scanner;

public class PrintDigitsFromLeft {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int count = 0;
        int temp = number;
        while(temp != 0){
            temp = temp/10;
            count++;
        }//754/100 = 7 // number = 754%100 = 54 // divisor = 100/10 = 10
        int divisor = (int) Math.pow(10, count-1);
        while (divisor!=0){
//            System.out.println(divisor);
//            System.out.println(number);
            int num = number/divisor;
            System.out.println(num);
            number = number%divisor;
            divisor = divisor/10;
        }
    }
}
