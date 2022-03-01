package org.kumar.planetds.recursion;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author saket
 *
 * */
public class GetMazePathWithJumps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter destination row coordinate");
        int dr = sc.nextInt();
        System.out.println("Enter destination column coordinate");
        int dc = sc.nextInt();

        ArrayList<String> paths = getMazePathWithJumps(1, 1, dr, dc);
        System.out.println(paths);
    }

    private static ArrayList<String> getMazePathWithJumps(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        for(int hm = 1; hm <= dc - sc; hm++){
            ArrayList<String> hPaths = getMazePathWithJumps(sr, sc + hm, dr, dc);
            for(String hPath : hPaths){
                paths.add("h" + hm + hPath);
            }
        }
        for(int vm = 1; vm <= dr - sr; vm++){
            ArrayList<String> vPaths = getMazePathWithJumps(sr + vm, sc, dr, dc);
            for(String vPath : vPaths){
                paths.add("v" + vm + vPath);
            }
        }
        for(int dm = 1; dm <= (dr - sr) && dm <= (dc - sc); dm++){
            ArrayList<String> dPaths = getMazePathWithJumps(sr + dm, sc + dm, dr, dc);
            for(String dPath : dPaths){
                paths.add("d" + dm + dPath);
            }
        }
        return paths;
    }
}
