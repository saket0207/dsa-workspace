package org.kumar.planetds.recursion;

import java.util.Scanner;

public class LogarithmicLinearPower {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();
        System.out.println("Enter index ");
        int index = sc.nextInt();
        int power = calculatePowerLogWay(number, index);
        System.out.println(power);

    }
    public static int calculatePowerLogWay(int number, int index){
        if(index == 0){
            return 1;
        }

        int powerHalfWay = calculatePowerLogWay(number, index / 2);
        int power = powerHalfWay * powerHalfWay;
        if(index % 2 == 1){
            power = power * number;
        }

        return power;


    }
}
