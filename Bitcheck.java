package com.ajp_day1;

public class Bitcheck {
    public static void main(String[] args) {
    
        if (args.length != 2) {
            System.out.println("Please provide two arguments: <num> <n>");
            return;
        }

      
        int num = Integer.parseInt(args[0]);  
        int n = Integer.parseInt(args[1]);    


        int mask = 1 << n;

      
        boolean isBitSet = (num & mask) != 0;

      
        if (isBitSet) {
            System.out.println("The " + n + "-th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + n + "-th bit of " + num + " is not set (0).");
        }
    }
}
