package org.kumar.planetds.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        System.out.println("Enter tower 1");
        int t1 = sc.nextInt();
        System.out.println("Enter tower 2");
        int t2 = sc.nextInt();
        System.out.println("Enter tower 1");
        int t3 = sc.nextInt();
        toh(n, t1, t2, t3);
    }

    private static void toh(int nod, int t1, int t2, int t3) {

            if(nod == 0){
                return;
            }
            toh(nod - 1, t1, t3, t2);
            System.out.println(nod + "[" + t1 + "-" +t2 + "]");
            toh(nod - 1, t3, t2, t1);
        }
}
