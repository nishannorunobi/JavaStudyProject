package com.nishan.java.seven.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("MyResources", Locale.getDefault());
	    System.out.println(rb.getString("name"));
	}

}
