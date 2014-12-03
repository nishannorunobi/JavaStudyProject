package com.nishan.java.reflection;

import java.io.Serializable;

public class MyBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name = "nishan";
	public MyBean() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyBean [name=" + name + "]";
	}
	

}
