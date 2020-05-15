package com.icici.loans.personalloans;

public class ChildClass extends D
{

	public static void main(String[] args) 
	{
		ChildClass obj= new ChildClass();
		obj.a1();
		obj.a2();
		
		
	}
	
	public void a1()
	{
		System.out.println("iam a1 overridden a1 method from Child Class");
	}

	@Override
	public void a2() {
		System.out.println("iam a2 overridden method in ChildClass");
	}

}
