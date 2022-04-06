package org.kumar.av.binarysearch;

import java.util.Scanner;

public class BinarySearchSortingOrderAgnostic {
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
        int index = binarySearchSOA(arr, n);
        System.out.println(index);
    }

    private static int binarySearchSOA(int[] arr, int n) {
        int start  = 0, end = arr.length - 1;
        if(arr[0] == arr[end]){
            return 0;
        }else if(arr[0] < arr[end]){
            while (start <= end){
                int mid = start + (end - start)/2;
                if(n == arr[mid]){
                    return mid;
                }else if(n < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }else{
            while(start <= end){
                int mid = start + (end - start)/2;
                if(n == arr[mid]){
                    return mid;
                }else if(n < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
