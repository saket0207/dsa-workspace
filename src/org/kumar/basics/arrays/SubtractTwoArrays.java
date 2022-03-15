package org.kumar.basics.arrays;

import java.util.Scanner;

public class SubtractTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter size of the 2nd array");
        int size2 = sc.nextInt();
        int [] arr2 = new int[size2];
        System.out.println("Enter array elements");
        for(int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }
        subtraction(arr, arr2);
    }

    private static void subtraction(int[] arr1, int[] arr2) {

        int i = arr1.length - 1, j = arr2.length - 1, k = arr2.length - 1; // assuming arr2 is bigger than arr1 in size
        int [] result = new int[arr2.length];
        int carry = 0;
        while(k >= 0){
            int d = carry;
            d += arr2[j];
            if(i >= 0) {
                if (arr2[j] >= arr1[i]) {
                    d -= arr1[i];
                    carry = 0;
                } else {

                    d += 10 - arr1[i];
                    carry = -1;
                }
            }
            result[k] = d;
            k--;
            j--;
            i--;
        }
        for(int val : result){
            System.out.print(val);
        }


    }
}
