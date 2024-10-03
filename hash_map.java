package com.set;

import java.util.HashMap;

public class hash_map {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding some initial key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 15);
        map.put("Orange", 20);

        // Print initial map
        System.out.println("Initial HashMap: " + map);

        // Specified key and value
        String key = "Mango";
        int value = 25;

        // Associate the specified value with the specified key
        map.put(key, value);

        // Print the updated map
        System.out.println("Updated HashMap: " + map);
    }
}
