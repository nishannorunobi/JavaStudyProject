package com.nishan.java.seven.internationalization;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public class MainConvertion2 {

	public MainConvertion2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ResourceBundle resource = ResourceBundle.getBundle("MyResources", Locale.UK);
	    Map<String, String> map = convertResourceBundleToMap(resource);

	    Iterator iterator = map.keySet().iterator();
	    while (iterator.hasNext()) {
	      String key = (String) iterator.next();
	      String value = map.get(key);
	      System.out.println(key + " = " + value);
	    }
	  }

	  static Map<String, String> convertResourceBundleToMap(ResourceBundle resource) {
	    Map<String, String> map = new HashMap<String, String>();

	    Enumeration<String> keys = resource.getKeys();
	    while (keys.hasMoreElements()) {
	      String key = keys.nextElement();
	      map.put(key, resource.getString(key));
	    }

	    return map;
	  }

}
