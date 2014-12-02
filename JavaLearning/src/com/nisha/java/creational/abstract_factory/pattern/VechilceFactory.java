package com.nisha.java.creational.abstract_factory.pattern;

public class VechilceFactory extends AbstractFactory{

	@Override
	Vehicle createVehicle() {
		return new MotorBike();
	}

	@Override
	Device createDevice() {
		// TODO Auto-generated method stub
		return new Mobile();
	}


}
