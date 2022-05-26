package org.kumar.av.heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestNumbers {

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9};
        int X = 7;
        int k = 3;


        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(arr.length, (c1, c2)->c2.getFirst() - c1.getFirst());

        for(int i = 0; i < arr.length; i++){
            maxHeap.add(new Pair(Math.abs(arr[i]-X), arr[i]));
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        for(Pair p : maxHeap){
            System.out.println(p.getSecond()

            );
        }
    }

}

class Pair implements Comparable {
    private int first;
    private int second;

    public Pair(int first, int second) {
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
        return this.first - ((Pair)o).first;
    }
}