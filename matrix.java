package com.basicprgms;

//example on 2*2 display of a matrix
class matrix
{
	public static void main(String[] args)
	{
		int[][] m = {{50,80},{31,85}},b={{22,565},{144,801}};
		
		int[][] i= new int[2][2];
		int r,c;
		
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				i[r][c]=m[r][c]+b[r][c];
			}
		}
		
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				System.out.print(i[r][c]+"\t");
			}
			System.out.println();
		}
	}
}