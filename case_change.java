package com.basicprgms;
//accept a character from user and change its case
class case_change
{
	public static void main(String[] args)
	{
		// Check if any arguments are passed
		if (args.length == 0) {
			System.out.println("Please provide a character as a command-line argument.");
			return;
		}
		
		// Take the first character from the first argument
		char ch = args[0].charAt(0);
		
		// Check if the input is not a letter
		if(!Character.isLetter(ch)) {
			System.out.println("Please enter letters only.");
		} else {
			// Change the case of the letter
			if(Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			} else {
				ch = Character.toLowerCase(ch);
			}
			
			System.out.println("Character now is: " + ch);
		}
	}
}
