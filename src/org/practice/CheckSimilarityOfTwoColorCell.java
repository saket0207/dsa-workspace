package org.practice;

import java.util.Scanner;

import static org.practice.ChessBoardCellColorFinder.*;

public class CheckSimilarityOfTwoColorCell {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of first cell");
        String cell1 = sc.next();
        System.out.println("Enter coordinates of second cell");
        String cell2 = sc.next();
        String s = null;

        try {
            s = findCellColor(cell1).equalsIgnoreCase(findCellColor(cell2)) ? "same" : "Not same";
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
