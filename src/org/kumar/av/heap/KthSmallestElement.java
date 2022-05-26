package org.kumar.av.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public static void main(String[] args) {

        int [] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(arr.length, Collections.reverseOrder());

        for(int i = 0; i < arr.length; i++){
            maxHeap.add(arr[i]);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        System.out.println(maxHeap.peek());
    }
}
