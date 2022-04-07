package org.kumar.av.binarysearch;

public class FindElementInSortedRotatedArray {

    public static void main(String[] args) {

        int [] arr =  {11, 12, 15, 16, 18, 2, 5, 6, 8};
        //find minimum  0   1   2   3   4   5  6 7  8
        int n = 16;

        int minElementIndex = findElementInSorted(arr, n);
        int indexLow = binarySearchCust(arr, 0, minElementIndex-1, n);
        int indexHi = binarySearchCust(arr, minElementIndex, arr.length-1, n);
        int index = 0;
        if(indexLow > 0){
            index = indexLow;
        }else if(indexHi > 0){
            index = indexHi;
        }
        System.out.println(index);
    }

    private static int binarySearchCust(int[] arr, int start, int end, int n) {
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == n){
                return mid;
            }else if(arr[mid] < n){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int findElementInSorted(int[] arr, int n) {
        int start = 0, end = arr.length - 1, N = arr.length;
        while (start <= end){
            if(arr[start] <= arr[end]){
                return start;
            }
            int mid = start + (end - start)/2;
            int prev = (mid - 1 + N) % N;
            int next = (mid + 1) % N;
            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                return mid;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

}
