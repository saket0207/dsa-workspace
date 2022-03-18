package org.kumar.basics.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackSpan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int [] ss = calculateStockSpan(arr);

        for(int s : ss){
            System.out.println(s);
        }
    }

    private static int[] calculateStockSpan(int[] arr) {
        int [] ss = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while(!stack.empty() && arr[stack.peek()] < arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ss[i] = i + 1;
            }else{
                ss[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return ss;
    }
}
