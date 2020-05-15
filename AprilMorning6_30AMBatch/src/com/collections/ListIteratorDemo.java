package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("oracle");
		a.add("kosmik");
		a.add("oaktech");
		a.add("Carrier");
		
		System.out.println(a);
		
		ListIterator<String> var = a.listIterator();
		while(var.hasNext())
		{
			String val = var.next();
			if(val.equals("oracle"))
				var.set("hatch Tech");
			else
				var.remove();
		}
		
		System.out.println(a);

	}

}
