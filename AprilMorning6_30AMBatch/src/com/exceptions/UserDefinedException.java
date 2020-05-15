package com.exceptions;

import java.util.Scanner;

public class UserDefinedException extends Exception
{

	public UserDefinedException(String msg)
	{
		super(msg);
	}

	public static void main(String[] args) 
	{
		
		String num;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("Enter the alphanumaric value : ");
			num = sc.nextLine();
			try 
			{
				if (num.length() != 10) 
				{
					throw new UserDefinedException("number should be 10 digit alpha numaric");
				} 
				else 
				{
					System.out.println(num);
					break;
				}
			} 
			catch (UserDefinedException e) 
			{
				e.printStackTrace();
			} 
			finally 
			{
				System.out.println("iam final Block....");
			}
		}

	}

}
