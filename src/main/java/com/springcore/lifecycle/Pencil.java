package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pencil implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pencil() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pencil [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("taking pensil: init");
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("pensil is finished: destroy");
	}

	
	
}
