package com.jsp.Method;

public class CalculatorDriver {
	public static void main(String[] args) {
		
		// Case1: static method
		Calculator.addTwoNumbers(50, 30);					// using classname
		Calculator c = new Calculator();
		c.addTwoNumbers(15, 42); 				    		// using object reference
		
		
		// Case2: non-static method
		Calculator c1 = new Calculator();
		c1.subTwoNumbers(25, 10);							// using object reference
		
		
		// Case3: static method
		int pro = Calculator.proTwoNumbers(6, 8);			// using classname
		System.out.println(pro);
		
		
		// Case4: non-static method
		Calculator c2 = new Calculator();
		System.out.println(c2.divideTwoNumbers(60, 10));	// using object reference
	}

}
