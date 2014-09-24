package com.nisha.java.creational.abstract_factory.pattern;

public class DeviceFactory extends AbstractFactory {

	@Override
	Vehicle createVehicle() {
		return new SchoolBus();
	}

	@Override
	Device createDevice() {
		return new Laptop();
	}

}
