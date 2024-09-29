package com.basicprgms;

public class MathUtil {

    // Method to check if a number is prime
    public static boolean isPrime(int no) {
        if (no <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(no); i++) {
            if (no % i == 0) {
                return false; // If the number is divisible by any number other than 1 and itself
            }
        }
        return true; // If no divisors are found, the number is prime
    }

    // Method to calculate the sum of digits of a number
    public static int getSum(int no) {
        int sum = 0;
        while (no != 0) {
            sum += no % 10; // Add the last digit of the number to sum
            no /= 10; // Remove the last digit
        }
        return sum;
    }
}
