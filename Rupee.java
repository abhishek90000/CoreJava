package com.ajp_day1;

class Rupee {
    
    private double amount;

    public Rupee(double amount) {
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount) {
     
        String message = (amount >= withdrawalAmount) 
                        ? "Withdraw successful" 
                        : "Insufficient balance";
        System.out.println(message);

        amount = (amount >= withdrawalAmount) ? amount - withdrawalAmount : amount;
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        Rupee myBank = new Rupee(10000);

        // Withdraw money
        myBank.withdraw(2000); 
        myBank.deposit(5000); 
        myBank.displayBalance();
    }
}

