package org.practice;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1 = "aaabbcccddaeeff";
        StringBuilder s2 = new StringBuilder();
        s2.append(s1.charAt(0));
        for(int i = 0, j = 1; j < s1.length(); j++){
            if(s1.charAt(i) != s1.charAt(j)){
                s2.append(s1.charAt(j));
            }
            i++;
        }
        System.out.println(s2);
        StringBuilder s3 = new StringBuilder();
        s3.append(s1.charAt(0));
        int count = 1;
        for(int i = 0, j = 1; j < s1.length(); j++){
            if(s1.charAt(i) != s1.charAt(j)){
                if(count > 1) {
                    s3.append(count);
                }
                s3.append(s1.charAt(j));
                count = 1;
            }else{
                count++;
            }
            i++;
        }
        if(count > 1){
            s3.append(count);
        }
        System.out.println(s3);
    }
}
