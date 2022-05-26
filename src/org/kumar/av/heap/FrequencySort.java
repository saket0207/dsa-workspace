package org.kumar.av.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    public static void main(String[] args) {
        int [] arr = {11, 11, 11, 33, 33, 33, 33, 22, 22, 44};
        int [] freqSortedResult = new int[arr.length];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        PriorityQueue<MyXPair> maxHeap = new PriorityQueue<>(map.size(), (c1, c2)-> c2.getFirst() - c1.getFirst());
        for(int key : map.keySet()){
            maxHeap.add(new MyXPair(map.get(key), key));
        }
        int k = 0;
        while(!maxHeap.isEmpty()){
            MyXPair poll = maxHeap.poll();
            int freq = poll.getFirst();
            while(freq > 0){
                freqSortedResult[k] = poll.getSecond();
                freq--;
                k++;
            }
        }
        for(int j = 0; j < freqSortedResult.length; j++){
            System.out.print(freqSortedResult[j] + " ");
        }
        System.out.println();
    }



}
class MyXPair implements Comparable{
    private int first;
    private int second;

    public MyXPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public int compareTo(Object o) {
        return this.first - ((MyXPair)o).first;
    }
}
