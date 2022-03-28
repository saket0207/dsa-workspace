package org.kumar.basics.stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression");
        String expression = sc.next();
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == '('){
                operator.push(ch);
            }else if(Character.isDigit(ch)){
                operand.push(ch - '0');
            }else if(ch == ')'){
                while(operator.size()!= 0 && operator.peek() != '('){
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    char optr = operator.pop();
                    int opRes = operation(optr, v1, v2);
                    operand.push(opRes);
                }
                operator.pop();
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                if(operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())){
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    char optr = operator.pop();
                    int opRes = operation(optr, v1, v2);
                    operand.push(opRes);
                }
                operator.push(ch);
            }
        }
        while(operator.size() != 0){
            int v2 = operand.pop();
            int v1 = operand.pop();
            char optr = operator.pop();
            int opRes = operation(optr, v1, v2);
            operand.push(opRes);

        }
        System.out.println(operand.peek());
    }

    private static int precedence(char ch) {
        if(ch == '+'){
            return 1;
        }else if (ch == '-'){
            return 1;
        }else if(ch == '*'){
            return 2;
        }else{
            return 2;
        }
    }
    private static int operation(char ch, int v1, int v2){
        if(ch == '+'){
            return v1 + v2;
        }else if (ch == '-'){
            return v1 - v2;
        }else if(ch == '*'){
            return v1 * v2;
        }else{
            return v1/v2;
        }
    }
}
