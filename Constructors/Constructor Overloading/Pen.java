package com.jsp.Constructor;

public class Pen {
	
		   String brand;
		   double price;
		   String color;
		   String type;
		   
		   
	   // Constructor Overloading
		   
	   public Pen(){
		   System.out.println("No argument");
	   }
	   
	   public Pen(String brand, double price) {
		   
	   }

	   public Pen(double price, String brand) {
		   
	   }
	   
	   public Pen(String brand, String color) {
		   this.brand = brand;
		   this.color = color;
	   }
	   
	   public Pen(String brand, String color, double price) {
		   this.brand = brand;
		   this.color = color;
		   this.price = price;
	   }
}
