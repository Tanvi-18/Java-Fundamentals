package com.jsp.ClassObject;

public class LaptopDriver {
	public static void main(String[] args) {
		
		
		Laptop L1 = new Laptop();			// Object is created 
		L1.brand = "DELL";
		L1.price = 55000.00;
		L1.ram = "8GB";
		L1.processor = "Intel";
		
		System.out.println(L1.brand);
		System.out.println(L1.price);
		System.out.println(L1.ram);
		System.out.println(L1.processor);
		System.out.println("==========");
		
		
		Laptop L2 = new Laptop();			//Object is created
		L2.brand = "HP";
		
		System.out.println(L2.brand);
		System.out.println(L2.price);
		System.out.println(L2.ram);
		System.out.println(L2.processor);
	}
	

}