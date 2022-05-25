package org.kumar.av.stack;

import java.util.Stack;

public class NextGreaterToLeft {

    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 4, 5, 9, 8, 10, 7};
        int [] result = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < arr.length; i++){

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
                else if(!st.isEmpty() && arr[i] <= st.peek()){
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
