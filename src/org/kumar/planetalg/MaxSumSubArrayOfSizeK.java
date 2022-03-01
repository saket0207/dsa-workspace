package org.kumar.planetalg;

public class MaxSumSubArrayOfSizeK {

    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 1, 5};
        int k = 2;
        int maxSumOfSizeK = findMaxSumSubArray(arr, k);
        System.out.println("Sum = " + maxSumOfSizeK);

    }

    private static int findMaxSumSubArray(int[] arr, int k) {

        int maxSum = Integer.MIN_VALUE, sumOfWindow = 0;
        for(int windowStart = 0, windowEnd = windowStart; windowEnd < arr.length; windowEnd++){
            if((windowEnd-windowStart) == k){
                if(maxSum < sumOfWindow){
                    maxSum = sumOfWindow;
                    System.out.println("max sum in each iteration: " + maxSum);
                }
                sumOfWindow = sumOfWindow - arr[windowStart];
                windowStart++;
            }
            sumOfWindow += arr[windowEnd];
        }
        return maxSum;
    }
}
