package org.kumar.basics.arrays;

import java.util.Scanner;

public class AddNumbersInTwoArrays {
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
        addition(arr, arr2);

    }

    private static void addition(int[] arr1, int[] arr2) {
        int maxLen = arr1.length;
        if(arr2.length > arr1.length){
            maxLen = arr2.length;
        }
        int [] resultArr = new int[maxLen];

        int carry = 0; int d = 0;
        int i = arr1.length - 1, j = arr2.length - 1;
        int k = maxLen - 1;
        while(k >= 0){
            if(i < 0 && j >= 0){
                d= carry + arr2[j];
            }else if(i >= 0 && j < 0){
                d = carry + arr1[i];
            }else if(i >= 0 && j >= 0) {
                d = carry + arr1[i] + arr2[j];
            }
            resultArr[k] = d % 10;
            carry = d / 10;
            k--;
            i--;
            j--;
        }
        if(carry != 0){
            System.out.print(carry);
        }
        for(int val : resultArr){
            System.out.print(val);
        }


    }
}
