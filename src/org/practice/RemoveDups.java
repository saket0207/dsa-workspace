package org.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDups {
    public static void main(String[] args) {

        int [] arr = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(arr));
    }

        public static int removeDuplicates(int[] nums) {

            Set<Integer> set = new HashSet<>();
            for(int n : nums){
                set.add(n);
            }
            return set.size();
        }

}
