package org.kumar.basics.stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String expression = sc.next();
        boolean isDuplicate = checkDuplicationOfBrackets(expression);
        System.out.println(isDuplicate);

    }

    private static boolean checkDuplicationOfBrackets(String expression) {

        boolean isDuplicate = false;
        Stack<Character> characterStack = new Stack<>();
        for(char ch : expression.toCharArray()){
            if(ch == ')'){
                if(characterStack.peek() == '('){
                    isDuplicate = true;
                    break;
                }else{
                    while(characterStack.peek() != '('){
                        characterStack.pop();
                    }
                    characterStack.pop();
                }

            }else{
                characterStack.push(ch);
            }

        }

        return isDuplicate;
    }
}
