package com.icici.loans.personalloans;

import com.icici.loans.homeloans.A;
import com.icici.loans.homeloans.B;

public class C extends A
{
	public void m3()
	{
		System.out.println("iam m3 from class C");
		System.out.println(x);
	}
	
	public void m1()
	{
		System.out.println("iam overriden m1 from class C");
	}
	
	public static void main(String[] args) 
	{
		B b= new B();
		b.m1();
		b.m2();
		System.out.println(b.x);
		
		C c = new C();
		c.m1();
		c.m3();
		System.out.println(c.x);
	}

}
