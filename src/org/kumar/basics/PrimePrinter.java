package org.kumar.basics;

import java.util.Scanner;

public class PrimePrinter{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numberOfPrime = sc.nextInt();
        System.out.println("Enter the numbers ");
        int [] arr = new int[numberOfPrime];
        for(int i = 0; i < numberOfPrime; i++){
            arr[i] = sc.nextInt();
            String primeTeller = checkIfPrime(arr[i]);
            System.out.println(primeTeller);
        }

    }
    public static String checkIfPrime(int num){
        if(num == 0 || num == 1){
            return "Neither prime nor composite";
        }
        int halfNum = num/2;
        boolean isPrime = true;
        for(int i = 2; i <= halfNum; i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }

        }
        if(isPrime){
            return "Prime";
        }else{
            return "Not Prime";
        }
    }
}
