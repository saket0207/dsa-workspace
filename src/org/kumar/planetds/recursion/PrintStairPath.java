package org.kumar.planetds.recursion;

import java.util.Scanner;

public class PrintStairPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter steps count ");
        int stepsCount = sc.nextInt();
        printStairInPath(stepsCount, "");

    }

    private static void printStairInPath(int steps, String path) {
        if(steps < 0){
            return;
        }
        if(steps == 0){
            System.out.println(path);
            return;
        }
        printStairInPath(steps - 1, path + "1");
        printStairInPath(steps - 2, path + "2");
        printStairInPath(steps - 3, path + "3");

    }

}
