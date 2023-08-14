package com.jsp.Constructor;

public class Employee {
	
	String name;
	int id;
	double salary;
	String email;
	String designation;
	
	// User-Defined Constructors
	
	// No Argument OR Zero Parameterized Constructor
	public Employee() {
		System.out.println("No argument constructor is called");
	}
	
	// Static Initializer
	static {
		System.out.println("Static Initializer");
	}
	
	
	// Argument OR Parameterized Constructor
	public Employee(String name, int id, double salary, String email, String job) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.email=email;
		this.designation=job;
	}
	
	// Non-Static Initializer
	{
		System.out.println("Non-Static Initializer");
	}

}

