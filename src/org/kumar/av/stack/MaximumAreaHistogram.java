package org.kumar.av.stack;

import java.util.Stack;

public class MaximumAreaHistogram {

    public static void main(String[] args) {

        int [] arr = {6, 2, 5, 4, 5, 1, 6};

        int [] nslArr = new int[arr.length];
        int [] nsrArr = new int[arr.length];

        Stack<Pair> stNSL = new Stack<>();
        Stack<Pair> stNSR = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            Pair p = new Pair(arr[i], i);
            if(stNSL.isEmpty()){
                nslArr[i] = -1;
                stNSL.push(p);
            }else {
                while (!stNSL.isEmpty() && arr[i] <= stNSL.peek().getFirst()) {
                    stNSL.pop();
                }
                if(stNSL.isEmpty()){
                    nslArr[i] = -1;
                }else if(!stNSL.isEmpty() && arr[i] > stNSL.peek().getFirst()){
                    nslArr[i] = stNSL.peek().getSecond();
                }
                stNSL.push(p);
            }


        }

        for(int i = arr.length-1; i >= 0; i--){
            Pair p = new Pair(arr[i], i);
            if(stNSR.isEmpty()){
                nsrArr[i] = -1;
                stNSR.push(p);
            }else{
                while (!stNSR.isEmpty() && arr[i] <= stNSR.peek().getFirst()){
                    stNSR.pop();
                }
                if(stNSR.isEmpty()){
                    nsrArr[i] = arr.length;
                }else if(!stNSR.isEmpty() && arr[i] > stNSR.peek().getFirst()){
                    nsrArr[i] = stNSR.peek().getSecond();
                }
                stNSR.push(p);
            }

        }
        int maxArea = Integer.MIN_VALUE;
        int area;
        for(int i = 0; i < arr.length; i++){
            area = (nsrArr[i] - nslArr[i] - 1) * arr[i];
            maxArea = Math.max(maxArea, area);
        }
        System.out.println("Max area " + maxArea);
    }
}
class Pair{
    private int first;
    private int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

}
