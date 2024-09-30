package com.exceptionhandling;

public class ArrayOutOfBounds {
    public static void main(String[] args) {
        // Define an array with 5 elements
        int[] numbers = {1, 2, 3, 4, 5};

        // Loop through the array and try to access elements beyond its length
        for (int i = 0; i <= numbers.length; i++) {
            try {
                // Accessing elements of the array
                System.out.println("Element at index " + i + ": " + numbers[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Catch and handle the exception
                System.out.println("ArrayIndexOutOfBoundsException: Tried to access index " + i + " but the array length is " + numbers.length);
            }
        }
    }
}
