package org.kumar.basics.stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfixNPrefix {
    public static void main(String[] args) {
        //Sample Postfix expression: 264*8/+3-
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postfix expression");
        String expression = sc.next();

        Stack<String> prefix = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<Integer> values = new Stack<>();

        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = values.pop();
                int v1 = values.pop();
                int v = operation(v1, v2, ch);
                values.push(v);

                String inV2 = infix.pop();
                String inV1 = infix.pop();
                String inV = "(" + inV1 + ch + inV2 + ")";
                infix.push(inV);

                String prev2 = prefix.pop();
                String prev1 = prefix.pop();
                String prev = ch + prev1 + prev2;
                prefix.push(prev);

            }else {
                prefix.push(ch + "");
                infix.push(ch + "");
                values.push(ch - '0');
            }
        }
        System.out.println(values.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());
    }

    private static int operation(int v1, int v2, char ch) {
        if(ch == '+'){
            return v1 + v2;
        }else if(ch == '-'){
            return v1 - v2;
        }else if(ch == '*'){
            return v1 * v2;
        }else{
            return v1 / v2;
        }
    }
}
