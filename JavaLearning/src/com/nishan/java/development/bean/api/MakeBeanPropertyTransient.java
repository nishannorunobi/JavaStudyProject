package com.nishan.java.development.bean.api;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

public class MakeBeanPropertyTransient {

	public MakeBeanPropertyTransient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IntrospectionException, FileNotFoundException {
		BeanInfo bi = Introspector.getBeanInfo(BeanToXmlTransient.class);
		PropertyDescriptor[] pds = bi.getPropertyDescriptors();
		for (int i = 0; i < pds.length; i++) {
			PropertyDescriptor propertyDescriptor = pds[i];
			if (propertyDescriptor.getName().equals("itemQuantities")) {
				propertyDescriptor.setValue("transient", Boolean.TRUE);
			}
		}
		BeanToXmlTransient bean = new BeanToXmlTransient();
		bean.setId(Long.valueOf(1));
		bean.setItemName("Item");
		bean.setItemColour("Red");
		bean.setItemQuantities(100);

		XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(
				"BeanTransient.xml")));

		encoder.writeObject(bean);
		encoder.close();

	}
}

class BeanToXmlTransient implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String itemName;

	private String itemColour;

	private Integer itemQuantities;

	public BeanToXmlTransient(){

	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemColour() {
		return itemColour;
	}

	public void setItemColour(String itemColour) {
		this.itemColour = itemColour;
	}

	public Integer getItemQuantities() {
		return itemQuantities;
	}

	public void setItemQuantities(Integer itemQuantities) {
		this.itemQuantities = itemQuantities;
	}
}