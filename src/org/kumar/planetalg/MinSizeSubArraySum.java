package org.kumar.planetalg;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        System.out.println(args);
        int [] arr = {2, 1, 5, 2, 8};
        int S = 7;
        int minSumSubArrayLengthOfSizeS = findMinSumSubArrayLengthOfSizeS(arr, S);
        System.out.println("min length = " + minSumSubArrayLengthOfSizeS);
    }
    private static int findMinSumSubArrayLengthOfSizeS(int[] arr, int s) {
        int minLength = 0, windowStart = 0, sumOfWindow = 0;
        return minLength;
    }
}
