package org.kumar.planetds.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSubsequence {

    public static void main(String[] args) {

        String name = "abc";
        ArrayList<String> subsequences = getSubsequence(name);
        System.out.print("{");
        int i = 0;
        for(; i < subsequences.size()-1; i++){
            System.out.print(subsequences.get(i) + ", ");
        }
        System.out.println(subsequences.get(i) + "}");

        System.out.println(subsequences.size());
    }

    private static ArrayList<String> getSubsequence(String name) {
        if(name.length() == 0){
            ArrayList<String> resultSeq = new ArrayList<>();
            resultSeq.add("");
            return resultSeq;
        }
        char firstChar = name.charAt(0);
        String ros = name.substring(1);
        ArrayList<String> rsSubSeq = getSubsequence(ros);
        ArrayList<String> subSeqStringList = new ArrayList<>();
        for(String str : rsSubSeq){
            subSeqStringList.add("" + str);
            subSeqStringList.add(firstChar + str);
        }
        return subSeqStringList;
    }
}
