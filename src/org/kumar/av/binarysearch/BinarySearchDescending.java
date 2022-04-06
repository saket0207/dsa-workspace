package org.kumar.av.binarysearch;

import java.util.Scanner;

public class BinarySearchDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter elements in sorted form");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search");
        int n = sc.nextInt();
        int index = binarySearchDesc(arr, n);
        System.out.println(index);
    }

    private static int binarySearchDesc(int[] arr, int n) {

        int start = 0, end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(n == arr[mid]){
                return mid;
            }else if (n < arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
