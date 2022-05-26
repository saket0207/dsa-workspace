package org.kumar.av.heap;

import java.util.PriorityQueue;

public class KLargestElement {

    public static void main(String[] args) {

        int [] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(arr.length);

        for(int i = 0; i < arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        System.out.println(minHeap);
    }
}
