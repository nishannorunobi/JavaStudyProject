package com.nishan.java.creational.factory.pattern;
import static com.nishan.java.creational.factory.pattern.Constant.*;
public class FactoryClass {

	public FactoryClass() {
		// TODO Auto-generated constructor stub
	}
	public static Vehicle getVehicle(String key){
		switch (key) {
		case bus:
			return new Bus();
		case truck:
			return new Truck();
		default:
			return null;
		}
	}
}
