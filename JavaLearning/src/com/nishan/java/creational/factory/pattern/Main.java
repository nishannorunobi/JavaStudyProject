package com.nishan.java.creational.factory.pattern;
import static com.nishan.java.creational.factory.pattern.Constant.*;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Vehicle vehicle1 = FactoryClass.getVehicle(bus);
		vehicle1.printName();
		Vehicle vehicle2 = FactoryClass.getVehicle(truck);
		vehicle2.printName();
	}

}
