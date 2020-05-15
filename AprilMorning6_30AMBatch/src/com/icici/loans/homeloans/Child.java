package com.icici.loans.homeloans;


class Parent
{
	public  int workhard()
	{
		int c=10;
		System.out.println("Wakeup early,goto college" + c);
		return c;
	}
	
	public void care()
	{
		System.out.println("atmost care");
	}
	
}

class Child1 extends Parent
{
	public strictfp int workhard()
	{
		System.out.println(" Child1 :Wakeup anytime,goto bar/parlorls");
		return 0;
	}
}


public class Child extends Parent
{
	
	public strictfp int workhard()
	{
		System.out.println("child : Wakeup anytime,goto bar/parlorls");
		return 0;
	}
	
	public void love()
	{
		System.out.println("iam in love....");
	}
	
	public static void main(String[] args) {
		Child c= new Child();
		c.workhard();
		c.care();
		c.love();
		
		
		Parent p;
		 
		p= new Child();
		p.workhard();
		
		p= new Child1();
		p.workhard();
		
		Parent p1= new Child();
		
		//Child c1= new Parent();
	}

}
