package org.kumar.planetds.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter destination row");
        int dr = sc.nextInt();
        System.out.println("Enter destination column");
        int dc = sc.nextInt();

        ArrayList<String> mazePath = getMazePath(1, 1, dr, dc);
        System.out.println(mazePath);
    }

    private static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

        if(sr == dr && sc == dc){
            ArrayList<String> paths = new ArrayList<>();
            paths.add("");
            return paths;
        }
        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();
        ArrayList<String> paths = new ArrayList<>();
        if(sc < dc) {
            hPaths = getMazePath(sr, sc + 1, dr, dc);
        }
        if(sr < dr) {
            vPaths = getMazePath(sr + 1, sc, dr, dc);
        }
        for(String hPath : hPaths){
            paths.add("h" + hPath);
        }
        for(String vPath : vPaths){
            paths.add("v" + vPath);
        }
        return paths;
    }
}
