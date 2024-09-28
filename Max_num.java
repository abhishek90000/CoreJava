package com.ajp_day1;
import java.util.Scanner;

public class Max_num {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Find the maximum using the ternary operator
        double max = (num1 > num2) ? num1 : num2;

        // Display the result
        System.out.println("The maximum number is: " + max);
        
        // Close the scanner
        scanner.close();
    }
}
