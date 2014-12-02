package com.nishan.java.creational.factory_method.pattern;

public class Factory {
 
	public static Person createPerson(String key){
		/// this is facroty method
		Person person = null;
		if(key.equals("student"))
			person = new Student("Karim");
		if(key.equals("teacher"))
			person = new Teacher("Abdul Wahid");
		return person;
	}

}
