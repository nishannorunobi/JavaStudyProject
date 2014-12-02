package com.nishan.java.creational.factory_method.pattern;

public class Teacher implements Person {
	String name;
	public Teacher(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
