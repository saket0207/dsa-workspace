package org.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {


        Integer [] list = {2,4, 7, 11, 15, 5};
        int sum = 9;
        int arr[] = new int[2];

//        Arrays.sort(list);


        for(int i = 0; i < list.length; i ++){
            int diff = sum - list[i];
            for(int j = i+1; j < list.length-1; i++){
                if(list[j] == diff){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }



}
