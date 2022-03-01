package org.kumar.basics;

import java.util.Arrays;
import java.util.Scanner;

public class InverseNumberPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();
        int inv = inverseNumber(number);
        System.out.println(inv);

    }
    public static int inverseNumber(int number){
        int temp = number, digCount = 0;
        while(temp!=0){
            temp = temp/10;
            digCount++;
        }
        int [] arr = new int[digCount];
        int count  = 0, sum = 0;
        while(number != 0){
            int j = number % 10;
            count++;
            arr[j-1] = count;
            number/=10;
        }
        Arrays.stream(arr).forEach(System.out::println);
        int multiplier = (int)Math.pow(10, count-1);
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]*multiplier;
            multiplier /=10;
        }
        return sum;
    }
}
