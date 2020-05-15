package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		h.add(40);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.hashCode());
		System.out.println(h.isEmpty());
		System.out.println(h.contains(40));
		
		System.out.println(h);
		h.add(50);
		h.remove(30);
		System.out.println(h);
		
	
		for(Integer i : h)
			System.out.println(i);
		
		h.clear();
		System.out.println(h);
		

	}

}
