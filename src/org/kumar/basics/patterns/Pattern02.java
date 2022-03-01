package org.kumar.basics.patterns;

public class Pattern02 {
/*
Pattern 02
*	*	*	*	*
*	*	*	*
*	*	*
*	*
*

* */
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
