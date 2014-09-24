package com.nishan.java.development.bean.api;

import java.beans.Beans;

public class CreateBeanInstance {
	private Long id;

	private String name;

	public CreateBeanInstance() {
	}

	public static void main(String[] args) throws Exception {
		CreateBeanInstance bean = (CreateBeanInstance) Beans.instantiate(ClassLoader.getSystemClassLoader(),
				"com.nishan.java.development.bean.api.CreateBeanInstance");

		bean.setId(1l);
		bean.setName("nishan");
		System.out.println("The Bean = " + bean);

	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[id=" + id + "; name=" + name + "]";
	}
}