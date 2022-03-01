package org.kumar.planetds.recursion;

import java.util.Scanner;

public class PrintMazePathsWithJump {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate of destination");
        int dr = sc.nextInt();
        System.out.println("Enter y coordinate of destination");
        int dc = sc.nextInt();
        printMazePathWithJump(1, 1, dr, dc, "");
    }

    private static void printMazePathWithJump(int sr, int sc, int dr, int dc, String psf) {

        if(dr == sc && sr == sc){
            System.out.println(psf);
            return;
        }
        for(int hms = 1; hms <= dc - sc; hms++) {
            printMazePathWithJump(sr, sc + hms, dr, dc, psf + "h" + hms);
        }
        for(int vms = 1; vms <= dr - sr; vms++) {
            printMazePathWithJump(sc + vms, sr, dr, dc, psf + "v" + vms);
        }
        for(int dms = 1; dms <= dr - sr && dms  <= dc - sc; dms++){
            printMazePathWithJump(sr + dms, sc + dms, dr, dc, psf + "d" + dms);
        }

    }
}
