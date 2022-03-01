package org.kumar.planetds.recursion;

public class PrintRevArrayRecursion {

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        displayRevArrRec(arr, 0);
    }

    private static void displayRevArrRec(int[] arr, int i) {
        if(i == arr.length){
            return;
        }
        displayRevArrRec(arr, i+1);
        System.out.println(arr[i]);

    }
}
