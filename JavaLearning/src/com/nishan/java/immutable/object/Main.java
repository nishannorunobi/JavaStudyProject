package com.nishan.java.immutable.object;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Location l1 = new Location(1,2);
		Location l2 = new Location(1,2);
		Location l3 = l2.setX(1);
		Location l4 = l1.setX(3);
		if(l1 == l4)
			System.out.println("l1=l2");
		if(l2 == l3)
			System.out.println("l2==l3");
	}

}
