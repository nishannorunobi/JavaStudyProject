package com.nishan.java.seven.internationalization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class MainConversion1 {
	static String fileName = "resouce_content_save";
	public MainConversion1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// convert resource bundle to properties
		ResourceBundle resource = ResourceBundle.getBundle("MyResources", Locale.UK);
		Properties properties = convertResourceBundleToProperties(resource);
		properties.setProperty("roll", "326");
		sendToOutPutStream(properties);

		// properties load from normal file
		Properties properties2 = new Properties();
		properties2.load(new FileInputStream(new File(fileName)));

		// properties load from normal xml file
		Properties properties3 = new Properties();
		properties3.loadFromXML(new FileInputStream(new File(fileName+".xml")));
		Enumeration keys = properties3.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String value = (String) properties3.get(key);
			System.out.println(key + " = " + value);
		}
	}
	private static void sendToOutPutStream(Properties properties) throws IOException {
		// below code provides the difference between java.util.map and java.util.properties
		// it can be send to output stream.
		// besides this api keeps the key/value in string format only
		// to read .properties file key/value those are string only
		// moreover, Properties extends Hashtable implements Map<K,V>
		OutputStream out = new FileOutputStream(new File(fileName));
		properties.store(out, "comments");
		properties.storeToXML(new FileOutputStream(new File(fileName+".xml")), "comments");
	}

	static Properties convertResourceBundleToProperties(ResourceBundle resource) {
		Properties properties = new Properties();

		Enumeration<String> keys = resource.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			properties.put(key, resource.getString(key));
		}

		return properties;
	}
}
