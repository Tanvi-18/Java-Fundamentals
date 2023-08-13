package com.jsp.JavaBasics;

public class SwitchCase {
	public static void main(String[] args) {
	
		int x = 8; int y = 2;
		int choice = 4;
		switch(choice) {
		case 1:
		{
			System.out.println((x+y) + " is Sum of 2 numbers");
		}
		break;
		
		case 2:
		{
			System.out.println((x-y) + " is Difference of 2 numbers");
		}
		break;
		
		case 3:
		{
			System.out.println((x*y) + " is Product of 2 numbers");
		}
		break;
		
		case 4:
		{
			System.out.println((x/y) + " is Division of 2 numbers");
		}
		break;
		
		default:
		{
			System.out.println("Invalid Input");
		}
		break;
		}
	
}
}
