package org.kumar.av.heap;

import java.util.PriorityQueue;

public class SortKSortedArray {

    public static void main(String[] args) {

        int [] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(arr.length);
        int sortedArr[] = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k){
                sortedArr[j] = minHeap.poll();
                j++;
            }
        }
        while (!minHeap.isEmpty()){
            sortedArr[j] = minHeap.poll();
            j++;
        }
        for(int s : sortedArr) {
            System.out.println(s);
        }
    }
}
