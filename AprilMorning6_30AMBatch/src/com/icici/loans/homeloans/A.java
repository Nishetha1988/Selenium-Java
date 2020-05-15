package com.icici.loans.homeloans;

import java.util.Date;

public class A {
	public int x = 100;

	public final static String cname = "vmware";

	public  strictfp void m1() {
		x = 200;
		System.out.println("iam m1 from class A");
		System.out.println(x);
	}

	public static void m4() {
		System.out.println("iam m4 static method.");
	}

	static {
		Date dt = new Date();
		System.out.println(dt);
	}

	static {
		System.out.println("iam 2nd static block");
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		System.out.println(a.x);
		A.m4();
	}
}
