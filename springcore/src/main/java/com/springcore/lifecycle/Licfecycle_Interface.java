package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Licfecycle_Interface implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("interface setting");
		this.price = price;
	}

	public Licfecycle_Interface() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Licfecycle_Interface [price=" + price + "]";
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy interface");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init interface");
	}
	
}
