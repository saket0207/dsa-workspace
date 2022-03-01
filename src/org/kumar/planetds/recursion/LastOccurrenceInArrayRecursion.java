package org.kumar.planetds.recursion;

import java.util.Scanner;

public class LastOccurrenceInArrayRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched ");
        int num = sc.nextInt();
        int li = lastOccurrenceIndex(arr, 0, num);
        System.out.println(li);
    }

    private static int lastOccurrenceIndex(int[] arr, int idx, int num) {

        if(idx == arr.length){
            return -1;
        }
        int liisa = lastOccurrenceIndex(arr, idx + 1, num);
        if(liisa == -1){
            if(arr[idx] == num){
                return idx;
            }else{
                return -1;
            }
        }else{
            return liisa;
        }

    }
}
