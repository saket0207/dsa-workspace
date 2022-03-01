package org.kumar.planetds.recursion;

public class PrintArrayRecursion {

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        displayArrRec(arr, arr.length - 1);
    }

    private static void displayArrRec(int[] arr, int i) {
        if(i == -1){
            return;
        }
        System.out.println(arr[i]);
        displayArrRec(arr, i-1);


    }
}
