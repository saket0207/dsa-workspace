package org.kumar.planetds.recursion;

public class MaxOfArrRecursion {

    public static void main(String[] args) {
        int [] arr = {42, 33, 4, 19, 71};
        int max = maxArrRec(arr, 0);
        System.out.println("Maximum of array is " + max);
    }

    private static int maxArrRec(int[] arr, int i) {
        if(i == arr.length-1){
            return arr[i];
        }
        int misa = maxArrRec(arr, i + 1);
        int max = Math.max(misa, arr[i]);
        return max;
    }
}
