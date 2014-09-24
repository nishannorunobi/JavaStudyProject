package com.nishan.java.creational.factory_method.pattern;

public class Client {
	static Person person;
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		person = Factory.createPerson("student");
		System.out.println(person.getName());
	}

}
