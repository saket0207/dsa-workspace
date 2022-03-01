package org.kumar.planetds.recursion;

import java.util.ArrayList;

public class KeypadCombination {

    static String [] keySet = {".,;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void main(String[] args) {

        ArrayList<String> keypadCombos = getKeypadCombination("678");
        System.out.println(keypadCombos);
        System.out.println(keypadCombos.size());


    }

    private static ArrayList<String> getKeypadCombination(String s) {
        if(s.length() == 0){
            ArrayList<String> ss = new ArrayList<>();
            ss.add("");
            return ss;
        }
        char firstChar = s.charAt(0);
        String subStr  = s.substring(1);
        ArrayList<String> rList = getKeypadCombination(subStr);
        ArrayList<String> keypadCombos = new ArrayList<>();
        int index = firstChar - '0';
        String firstKeyStr = keySet[index];
        for(int i = 0; i < firstKeyStr.length(); i++){
            for(String r : rList){
                keypadCombos.add(firstKeyStr.charAt(i) + r);
            }
        }
        return keypadCombos;

    }
}
