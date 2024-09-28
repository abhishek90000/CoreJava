package com.ajp_day1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input: Get the year from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year using if-else
        if (year % 400 == 0) {
            // If the year is divisible by 400, it's a leap year
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            // If the year is divisible by 100 but not by 400, it's not a leap year
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            // If the year is divisible by 4 and not by 100, it's a leap year
            System.out.println(year + " is a leap year.");
        } else {
            // In all other cases, it's not a leap year
            System.out.println(year + " is not a leap year.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
