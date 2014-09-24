package com.nishan.java.creational.factory_method.pattern;

public class Student implements Person {
	String name;
	public Student(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}
	
}
