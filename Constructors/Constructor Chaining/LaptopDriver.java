package com.jsp.Constructor;

public class LaptopDriver {
	public static void main(String[] args) {
		
		Laptop L1 = new Laptop("16GB", "HP", "Intel");
		
		System.out.println(L1.brand);
		System.out.println(L1.ram);
		System.out.println(L1.processor);
	}

}
