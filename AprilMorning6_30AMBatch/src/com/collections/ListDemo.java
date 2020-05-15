package com.collections;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		int[] x = {10,20,30,40};
		for(int i=0;i<x.length;i++)
		System.out.println(x[i]);

		
		ArrayList<Object> a = new ArrayList<>();
		a.add(10);
		a.add("ravilella");
		a.add(12.34f);
		a.add(10);
		a.add(20);
		a.add(30);
		
		System.out.println(a);
		
		//for(Object j : a)
			//System.out.println(j);
		
		System.out.println(a.get(1));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("ravilella"));
		System.out.println(a.hashCode());
		System.out.println(a.contains("ravilella"));
		
		System.out.println(a);
		a.add(50);
		System.out.println(a);
		a.add(1, "keerthan");
		System.out.println(a);
		
		System.out.println(a.remove(1));
		System.out.println(a);
		
		System.out.println(a.remove("ravilella"));
		System.out.println(a);
		
		a.clear();
		System.out.println(a);

	}

}
