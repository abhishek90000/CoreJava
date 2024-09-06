package com.inheritence;

//Base class
class Business_In_India {
 String businessNameVal;
 String registrationNumberVal;

 // Constructor
 public Business_In_India(String businessNameValInput, String registrationNumberValInput) {
     businessNameVal = businessNameValInput;
     registrationNumberVal = registrationNumberValInput;
 }

 // Display method
 public void displayDetails() {
     System.out.println("Business Name: " + businessNameVal);
     System.out.println("Registration Number: " + registrationNumberVal);
 }

}

//Derived class 1: Local Business
class Local_Business extends Business_In_India {
 String localAreaVal;

 // Constructor
 public Local_Business(String businessNameValInput, String registrationNumberValInput, String localAreaValInput) {
     super(businessNameValInput, registrationNumberValInput); // Call parent constructor
     localAreaVal = localAreaValInput;
 }

 // Display method
 public void displayDetails() {
     super.displayDetails(); // Call to the parent method
     System.out.println("Local Area: " + localAreaVal);
 }

}

//Derived class 2: International Business
class International_Business extends Business_In_India {
 String countriesOperatedVal;

 // Constructor
 public International_Business(String businessNameValInput, String registrationNumberValInput, String countriesOperatedValInput) {
     super(businessNameValInput, registrationNumberValInput); // Call parent constructor
     countriesOperatedVal = countriesOperatedValInput;
 }

 // Display method
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Countries Operated: " + countriesOperatedVal);
 }

}

//Main class
public class HierarchicalInheritanceDemo {
 public static void main(String[] args) {
     // Local business example
     Local_Business localBusiness = new Local_Business("Local Mart", "LM123", "Mumbai");
     System.out.println("Local Business Details:");
     localBusiness.displayDetails();

     System.out.println();

     // International business example
     International_Business internationalBusiness = new International_Business("Global Trade Co.", "GT567", "USA, UK, Germany");
     System.out.println("International Business Details:");
     internationalBusiness.displayDetails();
 }
}
