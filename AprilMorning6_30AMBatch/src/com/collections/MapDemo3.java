package com.collections;

import java.util.TreeMap;

public class MapDemo3 {

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(100, 300);
		h.put(10, 200);
		h.put(90, 100);
		h.put(40, 100);
		h.put(200, 500);
		h.put(40, 1000);
		
		System.out.println(h);
		System.out.println(h.get(20));
		System.out.println(h.size());
		System.out.println(h.hashCode());
		System.out.println(h.isEmpty());

	}

}
