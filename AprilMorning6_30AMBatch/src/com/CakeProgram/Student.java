package com.CakeProgram;

public class Student 
{
	private int sno;
	private String sname;
	
	
	public void setSno(int sno) 
	{
		this.sno = sno;
	}

	public void setSname(String sname) 
	{
		this.sname = sname;
	}

	public int getSno() 
	{
		return sno;
	}

	public String getSname() 
	{
		return sname;
	}


	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println(s1.sno);
		System.out.println(s1.sname);
	}

}
