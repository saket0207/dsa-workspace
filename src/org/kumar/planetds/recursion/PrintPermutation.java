package org.kumar.planetds.recursion;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str, "");
    }

    private static void printPermutations(String ques, String asf) {
        if(ques.length() == 0){
            System.out.println(asf);
            return;
        }
        for(int i = 0; i < ques.length(); i++){
            char iThChar = ques.charAt(i);
            String leftPart = ques.substring(0, i);
            String rightPart = ques.substring(i+1);
            String roq = leftPart + rightPart;
            printPermutations(roq, asf + iThChar);
        }
    }
}
