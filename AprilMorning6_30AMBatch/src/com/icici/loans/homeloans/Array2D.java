package com.icici.loans.homeloans;

public class Array2D 
{

	public static void main(String[] args) 
	{
		int x[] = {1,2,3};
		int y[] = {4,5,6};
		int z[] = {7,8,9};
		
		int a[][]=  {
						{1,2,3,4},
						{4,5,6},
						{7,8,9,10,11}
					};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
