package org.practice;

public class StringWithASCIIDiff {

    public static void main(String[] args) {

        String str = "abdgca";

        StringBuilder sb = new StringBuilder(str.charAt(0));

        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int diff = curr - prev;
            sb.append(diff);
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
