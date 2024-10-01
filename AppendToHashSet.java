package com.basicprgms;

import java.util.HashSet;
import java.util.Set;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> fruitSet = new HashSet<>();

        // Add some elements to the HashSet
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Cherry");

        // Display the HashSet before adding a new element
        System.out.println("HashSet before adding: " + fruitSet);

        // Append a specified element to the HashSet
        fruitSet.add("Date");

        // Display the HashSet after adding the new element
        System.out.println("HashSet after adding: " + fruitSet);
    }
}
