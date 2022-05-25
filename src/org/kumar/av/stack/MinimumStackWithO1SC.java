package org.kumar.av.stack;

import java.util.Stack;

public class MinimumStackWithO1SC {
    Stack<Integer> stack = new Stack<>();
    int minElement;
    public static void main(String[] args) {
        int [] arr = {18, 19, 29, 15, 16};
        MinimumStackWithO1SC minimumStackWithExtraSpace = new MinimumStackWithO1SC();
        minimumStackWithExtraSpace.myPush(arr[0]);
        minimumStackWithExtraSpace.myPush(arr[1]);
        minimumStackWithExtraSpace.myPush(arr[2]);
        System.out.println(minimumStackWithExtraSpace.myMin());
        System.out.println(minimumStackWithExtraSpace.myPop());
        minimumStackWithExtraSpace.myPush(arr[3]);
        System.out.println(minimumStackWithExtraSpace.myMin());
        System.out.println(minimumStackWithExtraSpace.myPop());
        minimumStackWithExtraSpace.myPush(arr[4]);
        System.out.println(minimumStackWithExtraSpace.myMin());
        System.out.println(minimumStackWithExtraSpace.myPop());
        System.out.println(minimumStackWithExtraSpace.myPop());
        System.out.println(minimumStackWithExtraSpace.myPop());
        System.out.println(minimumStackWithExtraSpace.myPop());
        System.out.println(minimumStackWithExtraSpace.myMin());
    }

    private int myPop() {
        int poppedElement = -1;
        if(stack.isEmpty()){
            return -1;
        }else{
            if(stack.peek() >= minElement){
                poppedElement = stack.pop();
            }else{
                poppedElement = minElement;
                stack.pop();
            }
        }
        return poppedElement;
    }

    private int myMin() {
        if(stack.isEmpty()){
            return -1;
        }else{
            if(stack.peek() >= minElement){
                return minElement;
            }else{
                int min = minElement;
                minElement = 2*minElement-myPeek();
                return min;
            }
        }
    }

    private void myPush(int x) {
        if(stack.isEmpty()){
            stack.push(x);
            minElement = x;
        }else{
            if(x >= stack.peek()){
                stack.push(x);
            }else{
                stack.push(2*x-minElement);
                minElement = x;
            }
        }
    }
    private int myPeek(){
        if(stack.isEmpty()){
            return -1;
        }else{
            if(stack.peek() > minElement){
                return stack.peek();
            }else{
                return minElement;
            }
        }
    }

}
