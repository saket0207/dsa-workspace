package org.kumar.basics.stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostNPrefixEvaluation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression");
        String expression = sc.next();
        Stack<Character> operators = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();

        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == '('){
                operators.push(ch);

            }else if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                prefix.push(ch + "");
                postfix.push(ch + "");
            }else if(ch == ')'){
                while(operators.peek() != '('){
                    process(operators, postfix, prefix);
                }
                operators.pop();
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while (operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())){
                    process(operators, postfix, prefix);
                }
                operators.push(ch);
            }
        }
        while (operators.size() != 0){
            process(operators, postfix, prefix);
        }
        System.out.println(postfix.pop());
        System.out.println(prefix.pop());
    }

    private static void process(Stack<Character> operators, Stack<String> postfix, Stack<String> prefix) {
        char op = operators.pop();

        String postv2 = postfix.pop();
        String postv1 = postfix.pop();
        String postv = postv1 + postv2 + op;
        postfix.push(postv);

        String prev2 = prefix.pop();
        String prev1 = prefix.pop();
        String prev = op + prev1 + prev2;
        prefix.push(prev);
    }

    public static int precedence(Character ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }else if(ch == '*'){
            return 2;
        }else{
            return 2;
        }
    }
}
