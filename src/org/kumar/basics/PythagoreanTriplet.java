package org.kumar.basics;

import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        boolean isPT;
        int max = n1 > n2 ? n1 > n3 ? n1 : n3 : n2 > n3 ? n2 : n3;
        if(max == n1){
            isPT = n1*n1 == (n2*n2) + (n3*n3);

        }else if(max == n2){
            isPT = n2*n2 == (n1*n1) + (n3*n3);
        }else {
            isPT = n3*n3 == (n1*n1) + (n2*n2);
        }
        System.out.println(isPT);
    }
}
