package com.icici.loans.homeloans;

public class Methodoverloading 
{
	
	
	 public void m1(float i,int j) 
	 { 
		 System.out.println(i); 
	}
	 
	 public void m1(int i,float j) 
	 { 
		 System.out.println(i); 
	}
	 
	
	public void m1(float sal)
	{
		System.out.println(sal);
	}
	
	public void m1(String s)
	{
		System.out.println(s);
	}
	
	public void m1(Integer s)
	{
		System.out.println(s);
	}
	
	public void m1(Number s)
	{
		System.out.println(s);
	}
	
	public void m1(Object s)
	{
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		Methodoverloading obj= new Methodoverloading();
		obj.m1(10);
		obj.m1(12.345f);
		obj.m1("ravilella");
		obj.m1(200);
		obj.m1(23.456f);
		obj.m1("selenium");
	}

}
