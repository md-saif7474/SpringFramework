package com.springcore.lifecycle;

public class Lifecycle {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Lifecycle [price=" + price + "]";
	}

	public Lifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// we can keep any name of method init and destroy
	public void init()
	{
		System.out.println("init method");
	}
	
	public void destroy()
	{
		System.out.println("destry method");
	}
	
}
