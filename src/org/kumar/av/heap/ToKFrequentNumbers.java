package org.kumar.av.heap;



import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ToKFrequentNumbers {

    public static void main(String[] args) {

        int [] arr = {11, 11, 11, 33, 33, 33, 33, 22, 22, 44};
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        PriorityQueue<NewPair> minHeap = new PriorityQueue<>(arr.length, Comparator.comparingInt(NewPair::getFirst));
        for(int key : map.keySet()){
            minHeap.add(new NewPair(map.get(key), key));
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        minHeap.stream().forEach(x-> System.out.print(x.getSecond() + " "));
    }
}
 class NewPair{
    private int first;
    private int second;

     public NewPair(int first, int second) {
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
 }
