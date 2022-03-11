package org.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class LongestCommonSubString {

    public static void main(String[] args) {
        String sbsStr = "";
        String [] strs = {"flower","flow","flight"};
        int i = 0, j = 0;
        HashSet<Character> characterSet = new HashSet<>();
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        int smallestStringLen = strs[0].length();
        while(j < smallestStringLen) {
            while (i < strs.length) {
                characterSet.add(strs[i].charAt(j));

            }
            if (characterSet.size() > 1) {
                j++;
            }else{
                sbsStr += characterSet.toArray()[0] + "";
            }

        }
        System.out.println(sbsStr);
    }
}
