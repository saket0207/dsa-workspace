package org.kumar.dynamicprogramming;

public class KnapsackO1 {
    public static void main(String[] args) {

        int [] w = {2, 3, 5, 7, 9};
        int [] v = {10, 20, 4, 3, 11};
        int cap = 10;

        int n = w.length;
        int [][] t = new int[n + 1][cap + 1];
        for(int i = 0; i < n + 1; i++){ //Converting base condition of recursion to initialization steps of 2D array. why 2D array: because 2 parameters are changing
            for(int j = 0; j < cap + 1; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < cap+1; j++){
                if(w[i-1] <= j){ //
                    t[i][j] = Math.max(v[i-1] + t[i-1][j - w[i-1]], t[i-1][j]); //t[n][cap] = Math.max(v[n-1] + knapsack(w, v, cap - w[n-1], n-1), knapsack(w, v, cap, n-1)
                }else{
                    t[i][j] = t[i-1][j]; //t[n][cap] = knapsack(w, v, cap, n-1)
                }
            }
        }
        System.out.println("Max Profit = " + t[n][cap]);

    }
}
