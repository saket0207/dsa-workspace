package org.kumar.planetds.recursion;

import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        printSubSequence(str, "");

    }

    private static void printSubSequence(String question, String ans) {
        if(question.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        char firstChar = question.charAt(0);
        String roq = question.substring(1);
        printSubSequence(roq, ans + firstChar);
        printSubSequence(roq, ans + "");


    }
}
