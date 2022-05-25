package org.kumar.av.stack;

public class RainWaterTrapping {

    public static void main(String[] args) {

//        int [] arr = {3, 0, 0, 2, 0, 4};
        int [] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int [] maxL = new int[arr.length];
        int [] maxR = new int[arr.length];

        int sum = 0;
        maxL[0] = arr[0];
//      0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3
        for(int i = 1; i < arr.length; i++){
            maxL[i] = Math.max(maxL[i-1], arr[i]);
        }

        maxR[arr.length-1] = arr[arr.length-1];
//      3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1
        for(int j = arr.length - 2; j >= 0; j--){
            maxR[j] = Math.max(maxR[j+1], arr[j]);
        }
        for(int i = 0; i < arr.length; i++){
            sum +=  Math.min(maxL[i], maxR[i]) - arr[i];
        }
        System.out.println(sum);
    }
}
