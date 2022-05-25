package org.kumar.av.stack;

import java.util.Stack;

public class MinimumStackWithExtraSpace {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> ss = new Stack<>();
    
    public static void main(String[] args) {
        
        int [] arr = {18, 19, 29, 15, 16};
        
        MinimumStackWithExtraSpace minimumStackWithExtraSpace = new MinimumStackWithExtraSpace();
        minimumStackWithExtraSpace.push(arr[0]);
        minimumStackWithExtraSpace.push(arr[1]);
        minimumStackWithExtraSpace.push(arr[2]);
        System.out.println(minimumStackWithExtraSpace.min());
        System.out.println(minimumStackWithExtraSpace.pop());
        minimumStackWithExtraSpace.push(arr[3]);
        System.out.println(minimumStackWithExtraSpace.min());
        System.out.println(minimumStackWithExtraSpace.pop());
        minimumStackWithExtraSpace.push(arr[4]);
        System.out.println(minimumStackWithExtraSpace.min());
        System.out.println(minimumStackWithExtraSpace.pop());
        System.out.println(minimumStackWithExtraSpace.pop());
        System.out.println(minimumStackWithExtraSpace.pop());
        System.out.println(minimumStackWithExtraSpace.pop());
        System.out.println(minimumStackWithExtraSpace.min());
    }

    private int min() {

        return ss.isEmpty() ? -1 : ss.peek();
    }

    private int pop() {
        int poppedElement = -1;
        if(s.isEmpty()){
            return -1;
        }else{
            if(s.peek() > ss.peek()){
                poppedElement = s.pop();
            }else{
                s.pop();
                poppedElement = ss.pop();
            }
        }
        return poppedElement;
    }

    private void push(int i) {

        if(s.isEmpty()) {
            ss.push(i);
        }else{
            if(i < ss.peek()){
                ss.push(i);
            }
        }
        s.push(i);
    }

}
