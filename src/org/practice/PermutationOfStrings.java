package org.practice;

public class PermutationOfStrings {

    public static void main(String[] args) {

        String str = "abc";
        int length = str.length();
        int fact = calculateFactorial(length);
        for(int i = 0; i < fact; i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = length;
            int rem = 0;
            int tempi = i;
            while (temp != 0) {
                rem = tempi % temp;
                tempi = tempi / temp;
                temp--;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
            }
            System.out.println();
        }

    }

    private static int calculateFactorial(int length) {
        int fact = 1;
        for(int i = length; i >= 1; i--){
            fact = fact * i;
        }
        return fact;
    }
}
