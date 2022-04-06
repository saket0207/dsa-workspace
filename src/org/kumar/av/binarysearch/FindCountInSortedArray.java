package org.kumar.av.binarysearch;

public class FindCountInSortedArray {
//Count of occurrence of a given number
    public static void main(String[] args) {

        int [] arr = {5, 7, 7, 7, 7, 18, 26, 37};
        int n = 7;
        int fIndex = findFirstOccurrence(arr, n);
        int lIndex = findLastOccurrence(arr, n);
        System.out.println(lIndex - fIndex + 1);
    }

    private static int findFirstOccurrence(int[] arr, int n) {
        int ans = -1, start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(n == arr[mid]){
                ans = mid;
                end = mid - 1;
            }else if(n < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    private static int findLastOccurrence(int [] arr, int n){
        int ans = -1, start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(n == arr[mid]){
                ans = mid;
                start = mid + 1;
            }else if(n < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
