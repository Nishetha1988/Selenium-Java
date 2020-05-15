package com.icici.loans.homeloans;

public class ArrayOfObjects 
{
	

	public static void main(String[] args) 
	{
		Employeee e1= new Employeee(100, "ravilella");
		Employeee e2= new Employeee(200, "sai");
		Employeee e3= new Employeee(300, "kiran");
		
		//System.out.println(e1);
		//System.out.println(e2);
		//System.out.println(e3);
		
		Employeee[] e = new Employeee[3];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		
		for(Employeee obj : e)
		{
			System.out.println(obj);
		}
	
	}
	

}

class Employeee extends Object
{
	int eno;
	String ename;
	
	public Employeee(int eno,String ename) 
	{
		this.eno=eno;
		this.ename=ename;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
	}

	@Override
	public String toString() 
	{
		return "Employeee [eno=" + eno + ", ename=" + ename + "]";
	}
	
	
	
	
}
