package com.jsp.Constructor;

public class Laptop {
	
		String brand;
		String ram;
		String processor;
		double price;
		
		
	// Constructor Chaining	
		
	public Laptop() {
		System.out.println("Object Loading Started");
	}
	
	public Laptop(String brand, String ram) {
		this();
		this.brand = brand;
		this.ram = ram;
	}
	
	public Laptop(String ram, String brand, String processor) {
		this(brand, ram);
		this.processor = processor;
	}
	
}
