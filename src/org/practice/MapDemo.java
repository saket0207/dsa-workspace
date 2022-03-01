package org.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, String> dictionary = new TreeMap<>();
        dictionary.put("Book", "Collection of pages");
        dictionary.put("Table", "Object to keep things upon");
        dictionary.put("Headphones", "Device to listen to music");
        dictionary.forEach((k, v)-> System.out.println(k + " : " + v));
        System.out.println("---> " + Double.parseDouble(""));

    }
}
