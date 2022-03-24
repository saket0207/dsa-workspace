package org.kumar.basics.stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int size = sc.nextInt();
        System.out.println("Enter histogram data");
        int [] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int [] rb = new int[size];
        Stack<Integer> st = new Stack<>();
        st.push(size - 1);
        rb[size - 1] = size;
        for(int i  = size - 2; i >= 0; i--){
            while (st.size() > 0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                rb[i] = size;
            }else{
                rb[i] = st.peek();
            }
            st.push(i);
        }
        st.empty();
        int [] lb = new int[size];
        lb[0] = -1;
        st.push(0);
        for(int i = 1; i < arr.length; i++){
            while (st.size() > 0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                lb[i] = -1;
            }else{
                lb[i] = st.peek();
            }
            st.push(i);
        }
        int maxArea = 0;
        for(int i = 0; i < arr.length; i++){
            int width = rb[i] - lb[i] - 1;
            int area = width * arr[i];
            if(area > maxArea){
                maxArea = area;
            }
        }
        System.out.println(maxArea);
    }
}
