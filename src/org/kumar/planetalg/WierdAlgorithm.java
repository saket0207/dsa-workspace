package org.kumar.planetalg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WierdAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        wierdAlgorithm(n);
    }

    private static void wierdAlgorithm(int n) {
        List<Integer> list = new ArrayList<>();
        while(n != 1){

            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = (n * 3) + 1;
            }

            list.add(n);

        }
        int i = 0;
        for(; i < list.size()-1; i++){
            System.out.print(list.get(i) + "->");
        }
        System.out.println(list.get(i));

    }
}
