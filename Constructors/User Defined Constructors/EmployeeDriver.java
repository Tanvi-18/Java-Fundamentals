package com.jsp.Constructor;

public class EmployeeDriver {
	public static void main(String[] args) {
		
		// No argument constructor is called
		Employee e1 = new Employee();
		
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println("===================");
		
		
		// Parameterized constructor is called 
		Employee e2 = new Employee("ABC", 1234, 45000, "abc@gmail.com", "Manager");
				
		System.out.println(e2.name);
		System.out.println(e2.id);
		System.out.println(e2.salary);
		System.out.println(e2.email);
		System.out.println(e2.designation);
		
	}

}

