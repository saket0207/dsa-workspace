package org.kumar.planetds.recursion;

import java.util.Scanner;

public class PrintMazePath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter destination row ");
        int dr = sc.nextInt();
        System.out.print("Enter destination col ");
        int dc = sc.nextInt();
        printMazePath(1, 1, dr, dc, "");

    }

    private static void printMazePath(int sr, int sc, int dr, int dc, String psf) {
        if(dr < sr || dc < sc){
            return;
        }
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        printMazePath(sr, sc + 1, dr, dc, "h" + psf);
        printMazePath(sr + 1, sc, dr, dc, "v" + psf);
    }
}
