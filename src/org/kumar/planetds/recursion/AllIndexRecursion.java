package org.kumar.planetds.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class AllIndexRecursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched ");
        int num = sc.nextInt();
        int [] allIndex = findAllIndex(arr, 0, num, 0);
        for(int idx : allIndex){
            System.out.printf("%d ", idx);
        }
    }

    private static int[] findAllIndex(int[] arr, int idx, int num, int foundSoFar) {

        if(idx == arr.length){
            return new int[foundSoFar];
        }
        int [] allIndices;
        if(arr[idx] == num){
            allIndices = findAllIndex(arr, idx+1, num, foundSoFar+1);
            allIndices[foundSoFar] = idx;

        }else{
            allIndices = findAllIndex(arr, idx+1, num, foundSoFar);
        }
        return allIndices;
    }
}
