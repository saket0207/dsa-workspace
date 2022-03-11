package org.kumar.basics.patterns;

public class Patter13 {

    public static void main(String[] args) {

        for(int i = 0; i < 6; i++){
            int val = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(val + "\t");
                int icjp1 = val * (i - j) / (j + 1);
                val = icjp1;
            }
            System.out.println();
        }
    }
}
