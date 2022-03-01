package org.kumar.basics.patterns;

public class Pattern04 {
/*
Pattern 04
*	*	*	*	*
    *	*	*	*
        *	*	*
            *	*
                *

*/
    public static void main(String[] args) {
        int sp = 0, star = 5;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = star; j >= 1; j--){
                System.out.print("*\t");
            }
            sp++;
            star--;
            System.out.println();
        }
    }
}
