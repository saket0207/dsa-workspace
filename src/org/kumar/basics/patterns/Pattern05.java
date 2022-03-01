package org.kumar.basics.patterns;

public class Pattern05 {
/*
Pattern 05
        *
    *   *   *
*   *   *   *   *
    *   *   *
        *

*/
    public static void main(String[] args) {
        int sp = 5/2, st = 1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
            if(i <= 5/2){
                sp--;
                st+=2;
            }else{
                sp++;
                st-=2;
            }
            System.out.println();

        }

    }
}
