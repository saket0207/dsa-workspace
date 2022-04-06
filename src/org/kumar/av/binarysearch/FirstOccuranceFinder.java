package org.kumar.av.binarysearch;

public class FirstOccuranceFinder {

    public static void main(String[] args) {

        int [] arr = {5, 7, 7, 7, 18, 26, 37};
        int n = 7;
        int fIndex = findFirstOccurance(arr, n);
        System.out.println(fIndex);
        int lIndex = findLastOccurance(arr, n);
        System.out.println(lIndex);


    }

    private static int findFirstOccurance(int[] arr, int n) {
        int start  = 0, end = arr.length - 1, tempIndex = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(n == arr[mid]){
                tempIndex = mid;
                end = mid - 1;
            }else if(n < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return tempIndex;
    }
    private static int findLastOccurance(int[] arr, int n) {
        int start  = 0, end = arr.length - 1, tempIndex = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(n == arr[mid]){
                tempIndex = mid;
                start = mid + 1;
            }else if(n < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return tempIndex;
    }

}
