package com.basicprgms;

//example on precedence of operator
class prec_operator
{
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println("a+= "+a+3); //102
		System.out.println("a+3= "+(a+3)); //12
		System.out.println("a*6= "+a*6); //50
		System.out.println("a/4= "+a/4); //5
	}
}