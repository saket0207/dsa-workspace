package org.kumar.planetalg;

import java.util.Scanner;

public class LongestRepetition {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        int longestSubSeq = getLongestSubsequence(str);
        System.out.println("Longest sub sequence " + longestSubSeq);
    }
//ATTCGGGA CCCCCC
    private static int getLongestSubsequence(String str) {

        int lengthOfLongestSubSeq = 0;
        int tempLength = 1;
        for(int i = 0, j = 1; j < str.length(); j++){
            char ithChar = str.charAt(i);
            char jthChar = str.charAt(j);
            if(ithChar == jthChar){
                tempLength++;
            }else{
                if(tempLength > lengthOfLongestSubSeq){
                    lengthOfLongestSubSeq = tempLength;
                }
                tempLength = 0;
                i = j + 1;
            }
        }
        return lengthOfLongestSubSeq;
    }
}
