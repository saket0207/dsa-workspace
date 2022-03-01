package org.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("size " + list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for(int i = 0; i < list.size(); i++){
            System.out.printf( list.get(i) + " ");
        }
        System.out.println();
        list.add(2, 21);
        System.out.println(list);
        list.set(3, 31);
        System.out.println(list);
    }
}
