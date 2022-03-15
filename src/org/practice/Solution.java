package org.practice;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        if(s.length() == 0){
            return false;
        }
        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                charStack.push(s.charAt(i));
            }else{
                if(s.charAt(i) == ')'){
                    if(!charStack.isEmpty() && charStack.peek() == '('){
                        charStack.pop();
                    }else{
                        return false;
                    }
                }else if(s.charAt(i) == '}'){
                    if(!charStack.isEmpty() && charStack.peek() == '{'){
                        charStack.pop();
                    }else{
                        return false;
                    }
                } else if(s.charAt(i) == ']'){
                    if(!charStack.isEmpty() && charStack.peek() == '['){
                        charStack.pop();
                    }else{
                        return false;
                    }
                }

            }
        }
        if(charStack.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}