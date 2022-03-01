package org.kumar.basics;

import java.util.Scanner;

public class PrimePrinterWithRecursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        boolean isPrime = checkIfNumIsPrime(num);
        System.out.println(isPrime);
    }

    private static boolean checkIfNumIsPrime(int num) {
        int rem = calculatePrime(num);
        if(rem == 0){
            return true;
        }else{
            return false;
        }
    }

    private static int calculatePrime(int num) {
        if(num == 2){
            return 1;
        }
        int remainder = num%calculatePrime(num-1);
        return remainder;
    }
}
