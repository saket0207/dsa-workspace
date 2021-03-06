package org.kumar.basics.patterns;

import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = 5 ;//sc.nextInt();
        int sp = n / 2;
        int st = 1;
        int val = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            int cVal = val;
            for(int j = 1; j <= st; j++){
                System.out.print(cVal + "\t");
                if(j <= st/2){
                    cVal++;
                }else{
                    cVal--;
                }
            }
            if(i <= n/2){
                sp--;
                st += 2;
                val++;
            }else{
                sp++;
                st -= 2;
                val--;
            }

            System.out.println();
        }
    }
}
