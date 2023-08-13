package com.jsp.JavaBasics;

public class IfElseIf {
	public static void main(String[] args) {
		
		// if-else-if ladder
		int num = 15;
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}
}