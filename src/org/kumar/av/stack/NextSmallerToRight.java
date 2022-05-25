package org.kumar.av.stack;

import java.util.Stack;

public class NextSmallerToRight {

    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 1};
        int [] result = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--){
            if(st.isEmpty()){
                result[i] = -1;
                st.push(arr[i]);
            }else if(!st.isEmpty() && arr[i] > st.peek()){
                result[i] = st.peek();
            }else{
                while (!st.isEmpty() && arr[i] <= st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    result[i] = -1;
                }
                st.push(arr[i]);
            }
        }
        for(int r : result){
            System.out.print(r + " ");
        }

    }
}
