package org.kumar.basics.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression");
        String expression = "";
        expression += sc.nextLine();

        boolean isBalanced = checkIfBalanced(expression);
        System.out.println(isBalanced);
    }

    private static boolean checkIfBalanced(String expression) {
        Stack<Character> characterStack = new Stack<>();
        for(char ch : expression.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                characterStack.push(ch);
            }else if(ch == ')'){
                boolean isAptCharPresent = checkIfAptCharPresent(characterStack, '(');
                if(!isAptCharPresent){
                    return false;
                }
            }else if(ch == '}'){
                boolean isAptCharPresent = checkIfAptCharPresent(characterStack, '{');
                if(!isAptCharPresent){
                    return false;
                }
            }else if(ch == ']'){
                boolean isAptCharPresent = checkIfAptCharPresent(characterStack, '[');
                if(!isAptCharPresent){
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }

    private static boolean checkIfAptCharPresent(Stack<Character> characterStack, char ch) {
        if(!characterStack.isEmpty() && characterStack.peek() == ch){
            characterStack.pop();
            return true;
        }else{
            return false;
        }
    }


}
