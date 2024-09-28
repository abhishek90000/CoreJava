package com.ajp_day4;

import java.util.Scanner;

//Superclass: Animal
class Animal {
 // Method to be overridden
 public void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass: Dog
class Dog extends Animal {
 // Overriding the makeSound method for Dog
 @Override
 public void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Subclass: Cat
class Cat extends Animal {
 // Overriding the makeSound method for Cat
 @Override
 public void makeSound() {
     System.out.println("The cat meows.");
 }
}

//Main class
public class MethodOverridingDemo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Ask user to choose between Dog or Cat
     System.out.println("Which animal sound would you like to hear?");
     System.out.println("1. Dog");
     System.out.println("2. Cat");
     int choice = scanner.nextInt();
     
     // Creating an object based on user's choice
     Animal animal;
     
     switch (choice) {
         case 1:
             animal = new Dog(); // Dog object
             break;
         case 2:
             animal = new Cat(); // Cat object
             break;
         default:
             animal = new Animal(); // Default to Animal object
             System.out.println("Invalid choice, displaying default Animal sound.");
     }
     
     // Calling the overridden makeSound method
     animal.makeSound();
     
     scanner.close();
 }
}

