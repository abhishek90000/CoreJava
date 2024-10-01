package com.basicprgms;

import java.util.ArrayList;
import java.util.List;

public class SumEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numberList = new ArrayList<>();

        // Add some numbers to the ArrayList
        numberList.add(10);
        numberList.add(15);
        numberList.add(20);
        numberList.add(25);
        numberList.add(30);
        numberList.add(35);

        // Initialize the sum variable to 0
        int sumOfEvenNumbers = 0;

        // Loop through the ArrayList and sum up the even numbers
        for (int number : numberList) {
            if (number % 2 == 0) {
                sumOfEvenNumbers += number;  // Add only even numbers
            }
        }

        // Display the sum of even numbers
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    }
}
