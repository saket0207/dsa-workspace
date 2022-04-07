package org.kumar.av.binarysearch;

public class FindMinimum {

    public static void main(String[] args) {

        int [] arr =  {11, 12, 15, 16, 18, 2, 5, 6, 8};
        //find minimum  0   1   2   3   4   5  6 7  8

        int index = findMinElement(arr);
        System.out.println(index);
    }

    private static int findMinElement(int[] arr) {
        int start = 0, end = arr.length - 1, N = arr.length;

        while (start <= end){
            if(arr[start] < arr[end]){
                return start;
            }
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % N;
            int prev = (mid + N - 1)% N;
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                start = mid + 1;
            }else if(arr[mid] >= arr[end]){
                end = mid - 1;
            }
        }
        return -1;
    }

}
