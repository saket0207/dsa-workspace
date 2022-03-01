package org.practice;

import java.util.Scanner;

public class ChessBoardCellColorFinder {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cell coordinate string ");
        String cellCoordinate = sc.next();
        String color;
        try {
            color = findCellColor(cellCoordinate);
            System.out.printf("The color of the %s coordinate is %s", cellCoordinate, color);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
// A1 -> black
    public static String findCellColor(String cellCoordinate) throws Exception {

        String color;
        if(cellCoordinate.length() != 2){
            throw new Exception("Invalid input");
        }
        char alphaChar = cellCoordinate.toLowerCase().charAt(0);
        char numChar = cellCoordinate.toLowerCase().charAt(1);

        if(alphaChar < 'a' || alphaChar > 'h'){
            throw new Exception("Invalid input");
        }
        if(numChar < '1' || numChar > '8'){
            throw new Exception("Invalid input");
        }

        if(alphaChar == 'a' || alphaChar == 'c' || alphaChar == 'e' || alphaChar == 'g'){
            if(numChar == '1' || numChar == '3' || numChar == '5' || numChar == '7'){
                color = "black";
            }else{
                color = "white";
            }
        }else{
            if(numChar == '2' || numChar == '4' || numChar == '6' || numChar == '8'){
                color = "black";
            }else{
                color = "white";
            }
        }
        return color;
    }


}
