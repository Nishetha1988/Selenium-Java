package com.icici.loans.homeloans;

public class TwoDimArray
{

	public static void main(String[] args) 
	{
		int[] x = new int[4];// single
		
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		
		int[][] a = new int[3][3];  // double
		
		//0th row
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		//1st row
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
		//2nd row
		a[2][0]=70;
		a[2][1]=80;
		a[2][2]=90;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		//System.out.println(a[0][0]);
		//System.out.println(a[0][1]);
		//System.out.println(a[0][2]);
		
		

	}

}
