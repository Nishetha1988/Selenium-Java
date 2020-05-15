package com.collections;

import java.util.HashMap;

public class MapDemo1 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		h.put(10, 300);
		h.put(20, 200);
		h.put(10, 100);
		h.put(40, 100);
		h.put(50, 500);
		
		System.out.println(h);
		System.out.println(h.get(20));
		System.out.println(h.size());
		System.out.println(h.hashCode());
		System.out.println(h.isEmpty());
		

	}

}
