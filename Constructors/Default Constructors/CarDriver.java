package com.jsp.Constructor;

public class CarDriver {
	public static void main(String[] args) {
		
		Car c1 = new Car();					// Default constructor
		c1.color = "Black";		
		
		System.out.println(c1.brand);
		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(c1.price);
		System.out.println("==========");

		
		Car c2 = new Car();					// Default constructor
		
		System.out.println(c2.brand);
		System.out.println(c2.name);
		System.out.println(c2.color);
		System.out.println(c2.price);


	}

}
