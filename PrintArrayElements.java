package com.basicprgms;

public class PrintArrayElements {
    public static void main(String[] args) {
        // Declare and initialize an array with elements from 1 to 100
        int[] numbers = new int[100];

        // Populate the array with values from 1 to 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Print the array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " is: " + numbers[i]);
        }
    }
}
