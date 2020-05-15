package com.CakeProgram;

public class StudentChild 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		//System.out.println(s.sno);
		//System.out.println(s.sname);
		s.setSno(1744);
		System.out.println(s.getSno());
		
		s.setSname("ravikanth");
		System.out.println(s.getSname());
	}
	

}
