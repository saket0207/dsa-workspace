package org.kumar.planetds.recursion;

import java.util.Scanner;

public class LinearPower {

        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number ");
            int number = sc.nextInt();
            System.out.println("Enter index ");
            int index = sc.nextInt();
            int power = calculatePower(number, index);
            System.out.println(power);
        }
        public static int calculatePower(int number, int index){
            if(index == 0){
                return 1;
            }
            int power = number * calculatePower(number, index - 1);
            return power;
        }
}
