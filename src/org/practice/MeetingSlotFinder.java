package org.practice;

import java.util.Scanner;

public class MeetingSlotFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int n = sc.nextInt();
                
        int [][] meetings= new int[n][2];
        for(int i = 0; i < meetings.length; i++){
            for(int j = 0; j < meetings[i].length; j++){
                meetings[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(isAvaiable(meetings, 930, 1330));
    }

    private static boolean isAvaiable(int[][] meetings, int startTime, int endTime) {
        for(int i = 0; i < meetings.length; i++){
            if ((meetings[i][0] <= startTime && meetings[i][1] <= startTime) || (meetings[i][0] >= endTime && meetings[i][1] >= endTime))
            {
                return true;
            }
        }
        return false;
    }
}
