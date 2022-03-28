package org.kumar.basics.stack;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        System.out.println("Enter elements");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            stack.push(i);
        }
        while(stack.size() >= 2){
            int a = stack.pop();
            int b = stack.pop();
            if(arr[a][b] == 1){
                stack.push(b);
            }else{
                stack.push(a);
            }
        }
        int pot = stack.pop();
        for(int i = 0; i < arr.length; i++){
            if(pot != i){
                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    System.out.println("None");
                    return;
                }
            }
        }
        System.out.println(pot);
    }
}
