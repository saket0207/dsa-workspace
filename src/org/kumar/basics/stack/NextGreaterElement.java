package org.kumar.basics.stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int len = sc.nextInt();
        System.out.println("Enter elements");
        int [] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        int [] ngtrArray = new int[len];
        for(int a : arr){
            System.out.print(a + "\t");
        } // [5, 1, 4, 2, 66]
        Stack<Integer> st = new Stack<>();

        ngtrArray[len - 1] = -1;
        st.push(arr[len - 1]);
        for(int i = len-2; i >= 0; i--){
            while(!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ngtrArray[i] = -1;
            }else{
                ngtrArray[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println();
        for(int a : ngtrArray){
            System.out.print(a + "\t");
        }
    }
}
