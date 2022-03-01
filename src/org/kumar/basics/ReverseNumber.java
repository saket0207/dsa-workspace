package org.kumar.basics;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();
        reverseNumber(number);
    }

    private static void reverseNumber(int number) {
        while(number!=0){
            int rem = number%10;
            System.out.println(rem);
            number = number/10;
        }

    }
}
//j = 754 % 10// count++ // arr[j] = count // number /= 10 // sum = 0; sum += arr
//=========
//654321