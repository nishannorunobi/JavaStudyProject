package com.nishan.java.development.bean.api;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

public class SaveObjectToXml {

	public static void main(String[] args) throws Exception {
		Item bean = new Item();
		bean.setId(Long.valueOf(1));
		bean.setItemName("Scarf");
		bean.setItemColour("Red");
		bean.setItemQuantities(100);

		XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Bean.xml")));

		encoder.writeObject(bean);
		encoder.close();
	}
}

class Item implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String itemName;
	private String itemColour;
	private Integer itemQuantities;

	public Item(){

	}
	public Long getId() {
		return id;
	}
	public void setId(final Long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(final String itemName) {
		this.itemName = itemName;
	}
	public String getItemColour() {
		return itemColour;
	}
	public void setItemColour(final String itemColour) {
		this.itemColour = itemColour;
	}
	public Integer getItemQuantities() {
		return itemQuantities;
	}
	public void setItemQuantities(final Integer itemQuantities) {
		this.itemQuantities = itemQuantities;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemColour="
				+ itemColour + ", itemQuantities=" + itemQuantities + "]";
	}

}