package org.kumar.av.stack;

import java.util.Stack;

public class MaximumAreaBinaryMatrix {

    public static void main(String[] args) {

        int [][] matrix = {{0, 1, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1,1,0,0}};
        int [] arr = new int[matrix[0].length];
        for(int j = 0; j < matrix[0].length; j++){
            arr[j] = matrix[0][j];
        }
        int maxAreaArr0 = maxAreaHistogram(arr);

        for(int i = 1; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    arr[j] = 0;
                }else{
                    arr[j] += matrix[i][j];
                }
            }
            maxAreaArr0 = Math.max(maxAreaArr0, maxAreaHistogram(arr));
        }
        System.out.println(maxAreaArr0);
    }
    private static int maxAreaHistogram(int[] arr){
        int maxArea = Integer.MIN_VALUE;
        int area;
        int [] nslVector = nsl(arr);
        int [] nsrVector = nsr(arr);
        for(int i = 0; i < arr.length; i++){
            area = (nsrVector[i] - nslVector[i] - 1) * arr[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
//  4, 8, 5, 2, 25
    private static int[] nsr(int[] arr) {
        int [] nsrArray = new int[arr.length];
        Stack<MyPair> st = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--){
            MyPair myPair = new MyPair(arr[i], i);
            if(st.isEmpty()){
                nsrArray[i] = -1;
                st.push(myPair);
            }else if(!st.isEmpty() && arr[i] > st.peek().getFirst()){
                nsrArray[i] = st.peek().getSecond();
            }
            else{
                while (!st.isEmpty() && arr[i] <= st.peek().getFirst()){
                    st.pop();
                }
                if(st.isEmpty()){
                    nsrArray[i] = arr.length;
                }
                st.push(myPair);
            }
        }
        return nsrArray;
    }

    private static int[] nsl(int[] arr) {
        int [] nslArray = new int[arr.length];
        Stack<MyPair> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            MyPair myPair = new MyPair(arr[i], i);
            if(st.isEmpty()){
                nslArray[i] = -1;
                st.push(myPair);
            }else if(!st.isEmpty() && arr[i] > st.peek().getFirst()){
                nslArray[i] = st.peek().getSecond();
            }else{
                while(!st.isEmpty() && arr[i] <= st.peek().getFirst()){
                    st.pop();
                }
                if(st.isEmpty()){
                    nslArray[i] = -1;
                }
                st.push(myPair);
            }
        }
        return nslArray;
    }
}
class MyPair{
    private int first;
    private int second;

    public MyPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
