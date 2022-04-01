package org.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePrimeFromArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 18, 3, 19, 41, 70));

        for(int i = list.size() - 1; i >= 0; i--){
            if(isPrime(list, i)){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    private static boolean isPrime(List<Integer> list, int j) {
        int num =  list.get(j);
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
