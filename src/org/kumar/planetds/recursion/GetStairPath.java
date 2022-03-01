package org.kumar.planetds.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter step count ");
        int steps = sc.nextInt();
        ArrayList<String> paths = getStairPath(steps);
        System.out.println(paths);
    }

    private static ArrayList<String> getStairPath(int steps) {
        if(steps == 0){
            ArrayList<String> pathList = new ArrayList<>();
            pathList.add("");
            return pathList;
        }else if(steps < 0){
            ArrayList<String> negativePaths = new ArrayList<>();
            return negativePaths;

        }

        ArrayList<String> stairPaths1 = getStairPath(steps - 1);
        ArrayList<String> stairPaths2 = getStairPath(steps - 2);
        ArrayList<String> stairPaths3 = getStairPath(steps - 3);
        ArrayList<String> allPaths = new ArrayList<>();
        for(String path : stairPaths1){
            allPaths.add("1" + path);
        }
        for(String path : stairPaths2){
            allPaths.add("2" + path);
        }
        for(String path : stairPaths3){
            allPaths.add("3" + path);
        }
        return allPaths;
    }
}
