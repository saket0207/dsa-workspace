package org.practice;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {

    public static void main(String[] args) {

        String s1 = "IQ_P";
        String s2 = "IQ_T";
        String s3 = "IQ_M";
        List<String> abc = new ArrayList<>();
/*        abc.add("saket");
        abc.add("kumar");*/

        String s4 = "IQ_P";
        if(abc.size() == 1) {
            if (s4.equals(s1)) {
                System.out.println(s1);
            } else if (s4.equals(s2) || s4.equals(s3)) {
                System.out.println(s2);
            } else {
                    System.out.println("XYZ");
            }
        } else if (abc.size() > 1) {
            System.out.println("MLNR");
        }else{
            System.out.println("exception");
        }

    }
}
