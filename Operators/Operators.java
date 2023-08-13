package com.jsp.JavaBasics;

public class Operators {
	public static void main(String[] args) {
		
		//Assignment Operator (Unary Operator)
			int a = 20;
			System.out.println(a);
		    a+=20; 	//Compound Assignment Operator
		    System.out.println(a);
		    
		//Arithmetic Operator (Binary Operator)
		    int i = 18;
		    int j = 10;
		    System.out.println(i+j);
		    System.out.println(i-j);
		    System.out.println(i*j);
		    System.out.println(i/j);
		    System.out.println(i%j);
		    
		//Relational Operator (Binary Operator)
		    int x = 8;
		    int y = 5;
		    System.out.println(x<y);
		    System.out.println(x>y);
		    System.out.println(x<=y);
		    System.out.println(x>=y);
		    System.out.println(x==y);
		    System.out.println(x!=y);

		//Increment & Decrement Operator (Unary Operator)
		    int m = 2;
		    System.out.println(m++);
		    System.out.println(++m);
		    System.out.println(m--);
		    System.out.println(--m);
		    
		//Logical Operator
		    int b = 28; int c = 15; int d= 46;
		    boolean res1 = b>c && b>d;
		    boolean res2 = b>c || b>d; 
		    System.out.println(res1);
		    System.out.println(res2);
		    System.out.println(!res2);

		//Conditional Operator
		    int e = 4;
		    int f = 9;
		    int res = e>f ? e:f;
		    System.out.println(res);
		
	}

}