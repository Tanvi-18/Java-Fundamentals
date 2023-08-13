package com.jsp.Constructor;

public class PenDriver {
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		Pen p2 = new Pen("Cello", "Blue");
		Pen p3 = new Pen("Reynolds", "Black", 20.0);
		
		System.out.println(p1.type);
		System.out.println("==========");
		
		System.out.println(p2.brand);
		System.out.println(p2.color);
		System.out.println("==========");

		System.out.println(p3.brand);
		System.out.println(p3.color);
		System.out.println(p3.price);
		System.out.println("==========");
	}
	
}
