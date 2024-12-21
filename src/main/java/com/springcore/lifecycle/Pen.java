package com.springcore.lifecycle;

public class Pen {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Price of Pen");
		this.price = price;
	}

	public Pen() {
		super();
		
	}

	@Override
	public String toString() {
		return "Pen [price=" + price + "]";
	}
	
	public void hey() {
		System.out.println("Inside init method, saying hey");
	}
	public void bye() {
		System.out.println("Inside destroy method, saying bye");
	}
	
}
