package org.kumar.planetds.dynamicprogramming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        int [] arr = new int[number + 1];
        Map<Integer, Integer> map = new LinkedHashMap<>(number  + 1);
        int fibN = findFibMemoization(number, arr);
        int fibNM = findFibMemoizationUsingMap(number, map);
        System.out.println(fibN);
        System.out.println(fibNM);
    }

    private static int findFibMemoizationUsingMap(int number, Map<Integer, Integer> map) {
        if(number == 0 || number == 1){
            return number;
        }
        if(map.containsKey(number)){
            return map.get(number);
        }
        int fibnm1 = findFibMemoizationUsingMap(number - 1, map);
        int fibnm2 = findFibMemoizationUsingMap(number - 2, map);
        int fibNM = fibnm1 + fibnm2;

        map.put(number, fibNM);
        return fibNM;
    }

    private static int findFibMemoization(int number, int[] qb) {
        if(number == 0 || number == 1){
            return number;
        }
        if(qb[number] != 0){
            return qb[number];
        }
        int fibnm1 = findFibMemoization(number - 1, qb);
        int fibnm2 = findFibMemoization(number - 2, qb);
        int fibN = fibnm1 + fibnm2;

        qb[number] = fibN;
        return fibN;
    }
}
