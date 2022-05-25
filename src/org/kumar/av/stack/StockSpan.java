package org.kumar.av.stack;

import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {
        int [] arr = {100, 80, 60, 70, 60, 75, 85};
        int [] result = new int[arr.length];

        Stack<NewPair> st = new Stack<>();
        int [] finalRes = new int[arr.length];
        for(int i = 0; i < arr.length; i++){

            if(st.isEmpty()){
                result[i] = -1;
                NewPair pair = new NewPair(arr[i], i);
                st.push(pair);
                finalRes[i] = i - result[i];
            }else{
                while (!st.isEmpty() && arr[i] > st.peek().getFirst()){
                    st.pop();
                }
                if(st.isEmpty()){
                    result[i] = -1;
                    finalRes[i] = i - result[i];
                }
                else if(!st.isEmpty() && arr[i] <= st.peek().getFirst()){
                    result[i] = st.peek().getSecond();
                    finalRes[i] = i - result[i];
                }
                NewPair pair = new NewPair(arr[i], i);
                st.push(pair);
            }
        }
        for(int r : finalRes){
            System.out.print(r + " ");
        }
    }
}
class NewPair {
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
