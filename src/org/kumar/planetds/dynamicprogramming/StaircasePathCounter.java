package org.kumar.planetds.dynamicprogramming;

import java.util.Scanner;

public class StaircasePathCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the steps level ");
        int level = sc.nextInt();
        int countOfPaths = countPathInStaircase(level, new int[level + 1]);
        System.out.println(countOfPaths);
    }

    private static int countPathInStaircase(int level, int[] qb) {

        if(level == 0){
            return 1;
        }
        if(level < 0){
            return 0;
        }
        int pathm1 = countPathInStaircase(level - 1, qb);
        int pathm2 = countPathInStaircase(level - 2, qb);
        int pathm3 = countPathInStaircase(level - 3, qb);
        int path = pathm1 + pathm2 + pathm3;
        qb[level] = path;
        return path;
    }
}
