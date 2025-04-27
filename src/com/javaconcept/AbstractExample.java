package com.javaconcept;

abstract class VehicleType{
	abstract void speed();
	abstract void wheel();
	abstract void companyType();
	public void showMessage(){
		System.out.println("show message vehicle class");
	}
}
class Car extends VehicleType{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("car speed is 120km/h");
	}

	@Override
	void wheel() {
		// TODO Auto-generated method stub
		System.out.println("car have four wheel");
	}

	@Override
	void companyType() {
		// TODO Auto-generated method stub
		System.out.println("it has a four wheel.");
	}
	public void showMessageInCar(){
		System.out.println("show message in car");
	}
	}


public class AbstractExample {
public static void main(String[] args) {
	VehicleType vihiclecar =new Car();
	vihiclecar.companyType();
	vihiclecar.showMessage();
	//VehicleType class not have this method
	//vihiclecar.showMessageInCar();
	Car car =new Car();
	car.companyType();
	car.showMessage();
	car.showMessageInCar();
	

	
}
}
