package com.basicprgms;

public class prime_no {
    public static void main(String[] args) {
        // Ensure an argument is passed
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        int no = Integer.parseInt(args[0]);

        // Check if the number is prime using MathUtil
        if (MathUtil.isPrime(no)) {
            System.out.println(no + " is a prime number");
        } else {
            System.out.println(no + " is a composite number");
        }

        // Calculate and print the sum of digits using MathUtil
        System.out.println("Sum of digits of the given number is " + MathUtil.getSum(no));
    }
}
