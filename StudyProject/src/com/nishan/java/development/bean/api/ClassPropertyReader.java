package com.nishan.java.development.bean.api;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;

public class ClassPropertyReader {

	public ClassPropertyReader() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IntrospectionException {
		BeanInfo beanInfo = Introspector.getBeanInfo(Fruit.class);
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();

		for (PropertyDescriptor pd : pds) {
			String propertyName = pd.getName();
			System.out.println("propertyName = " + propertyName);
		}
	}
}

class Fruit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private double price;

	public Fruit() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}