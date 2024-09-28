package com.ajp_day1;
import java.util.Scanner;

public class StrongNumber {
    
    // Method to calculate the factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    
    // Method to check if a number is a Strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        
        // Loop through each digit of the number
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            sum += factorial(digit); // Add factorial of the digit to the sum
            temp /= 10; // Remove the last digit
        }
        
        // If sum of factorials of digits equals the original number, it's a Strong number
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check and output whether it's a Strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
        
        scanner.close();
    }
}
