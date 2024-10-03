package com.set;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        // Create an empty HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Check if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }

        // Adding some key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 15);

        // Check again if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
    }
}
