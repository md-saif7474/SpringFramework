package com.springcore.ref;

public class B {
	private String x;

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "B [x=" + x + "]";
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public B(String x) {
		super();
		this.x = x;
	}
	
}
