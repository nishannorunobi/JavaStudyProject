package com.nishan.java.reflection;

import java.beans.Beans;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderFromExternalClassPath {

	public ClassLoaderFromExternalClassPath() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		File file = new File("/home/nishan/workspace/StudyProject/bin/");

		URL url = file.toURI().toURL(); 
		URL[] urls = new URL[] { url };

		ClassLoader cl = new URLClassLoader(urls);

		Class cls = cl.loadClass("com.nishan.java.reflection.MyBean");
		
		Object obj = Beans.instantiate(cl, "com.nishan.java.reflection.MyBean");
		System.out.println(obj);
		
		// to know the source code location
		ClassLoaderFromExternalClassPath main = new ClassLoaderFromExternalClassPath();
		main.getCodeSourceLocation();
		System.out.println(main.getClass().getName() + " is loaded from "
		        + main.getClass().getProtectionDomain().getCodeSource().getLocation());
		
		/// source location
	    java.net.URL u = ClassLoaderFromExternalClassPath.class.getResource("");
	    System.out.println("This class (FromWhere) is located at : " + u);

	}
	
	private void getCodeSourceLocation() {
	    System.out.println("Code source location: "
	        + getClass().getProtectionDomain().getCodeSource().getLocation());
	  }
}