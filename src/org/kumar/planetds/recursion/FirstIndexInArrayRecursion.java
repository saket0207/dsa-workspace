package org.kumar.planetds.recursion;

public class FirstIndexInArrayRecursion {

    public static void main(String[] args) {

        int [] arr = {2, 3, 6, 9, 8, 3, 2, 6, 2, 4};
        int num = 412;
        int idx = firstOccurrence(arr, 0, num);
        System.out.println(idx);
    }

    private static int firstOccurrence(int[] arr, int idx, int num) {
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == num){
            return idx;
        }else{
            int fi = firstOccurrence(arr, idx + 1, num);
            return fi;
        }
    }
}
