package com.exceptionhandling;

import java.util.Scanner;

//Custom exception for Invalid UPI ID
class InvalidUPIException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidUPIException(String message) {
     super(message);
 }
}

public class UPITransaction {

 // Method to simulate a UPI transaction
 public static void processTransaction(String upiID) throws InvalidUPIException {
     // Simulating UPI ID validation
     if (!upiID.matches("[a-zA-Z0-9.]+@[a-zA-Z]+")) {
         throw new InvalidUPIException("Invalid UPI ID format: " + upiID);
     }
     
     // Simulate further checks and transaction processing
     System.out.println("UPI ID is valid. Processing transaction for " + upiID);
     
     // Simulating a successful transaction
     System.out.println("Transaction Successful!");
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Get UPI ID input from the user
     System.out.print("Enter your UPI ID: ");
     String upiID = scanner.nextLine();

     // Try to process the UPI transaction
     try {
         processTransaction(upiID);
     } catch (InvalidUPIException e) {
         // Handle the Invalid UPI Exception
         System.out.println("Transaction Failed: " + e.getMessage());
     } finally {
         // This block will always execute
         System.out.println("Transaction process ended.");
     }

     scanner.close();
 }
}
