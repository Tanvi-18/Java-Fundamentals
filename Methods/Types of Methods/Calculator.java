package com.jsp.Method;

public class Calculator {
	
	// static method 	void type
	public static void addTwoNumbers(int a, int b) {
		int res = a+b;
		System.out.println(res);
	}
	
	// non-static method	 void type
	public void subTwoNumbers(int a, int b) {
		System.out.println(a-b);		
	}
	
	// static method 	int return type
	public static int proTwoNumbers(int a, int b) {
		int pro = a*b;
		return pro;
	}
	
	// non-static method	 double return type
	public double divideTwoNumbers(int a, int b) {
		return a/b;
	}

}