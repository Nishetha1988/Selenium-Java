package com.collections;

import java.util.LinkedHashMap;

public class MapDemo2 {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, Integer> h = new LinkedHashMap<Integer, Integer>();
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
