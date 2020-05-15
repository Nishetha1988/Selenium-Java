package com.icici.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1="ravikanth";
		System.out.println(s1);
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.hashCode());
		System.out.println(s1.length());
		System.out.println(s1.startsWith("ravi"));
		System.out.println(s1.endsWith("nth"));
		
		
		
		String s2=new String(" Ravikanth");
		System.out.println(s2);
		
		//Checking for eqauality
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains(s2));
		
		//converting to lower & upper cases
		System.out.println(s2);
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		//Concatination
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//trimming
		System.out.println(s2);
		System.out.println(s2.trim());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2.trim()));
		System.out.println(s1.equals(s2.trim().toLowerCase()));
		
		//Splitting
		String name="ravikanth lella";
		System.out.println(name);
		
		String[] str = name.split(" ");
		System.out.println(str[0]);
		System.out.println(str[1]);
		
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
		
		//subString
		String str1="ravilella";
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 6));
		
		//Replace Strings
		System.out.println(str1);
		System.out.println(str1.replaceAll(str1, "ravikanth Lella"));

		//Replacing Characters
		System.out.println(str1);
		System.out.println(str1.replace('r', 'k'));
		
	}

}
