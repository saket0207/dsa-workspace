package org.kumar.basics.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        // n rows -> 2n-1 col
        int sp = 2*n-3; //sp -= 2
        int st = 1;// st++
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= st; j++){
                System.out.print(j + "\t");
            }
            for(int k = 1; k <= sp; k++){
                System.out.print("\t");
            }
            if(sp <= 0){
                st--;
            }
            for(int j = st; j >= 1; j--){
                System.out.print(j + "\t");
            }
            st++;
            sp -= 2;

            System.out.println();
        }
    }
}
