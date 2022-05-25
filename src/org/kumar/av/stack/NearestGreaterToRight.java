package org.kumar.av.stack;

import java.util.Stack;

public class NearestGreaterToRight {

    public static void main(String[] args) {

        int [] arr = {1, 3, 2, 4, 5, 9, 8, 10, 7};

        Stack<Integer> st = new Stack<>();
        int [] result = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--){
            if(st.isEmpty()){
                result[i] = -1;
                st.push(arr[i]);
            }else{
                while (!st.isEmpty() && arr[i] > st.peek()){
                     st.pop();
                }
                if(st.isEmpty()){
                    result[i] = -1;
                }
                else {
                    result[i] = st.peek();
                }
                st.push(arr[i]);
            }
        }
        for(int r : result){
            System.out.print(r + " ");
        }
    }
}
