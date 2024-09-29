package com.basicprgms;

class multiple_loop
{
	public static void main(String[] args)
	{
		// Declare 'cntr' outside of the loops to use in multiple loops
		int cntr;
		
		// Print "hello" 5 times
		for(cntr = 0; cntr < 5; cntr++) {
			System.out.println("hello");
		}
		
		// Print "hi" 6 times
		for(cntr = 0; cntr < 6; cntr++) {
			System.out.println("hi");
		}
	}	
}
