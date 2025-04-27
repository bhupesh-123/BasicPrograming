package com.javaconcept;

 interface  Vehicle{
	 String getBrand();
	    
	    String speedUp();
	    
	    String slowDown();
	    
	    default String turnAlarmOn() {
	        return "Turning the vehicle alarm on.";
	    }
	    
	    default String turnAlarmOff() {
	        return "Turning the vehicle alarm off.";
	    }
	    static String StaticMethod(){
	    	return "return static mejthod";
	    }
}
  interface Alarm {
	  
	    default String turnAlarmOn() {
	        return "Turning the alarm on.";
	    }
	    
	    default String turnAlarmOff() {
	        return "Turning the alarm off.";
	    }
	}

public class Interface_java_8  implements Vehicle,Alarm{

	 private String brand;
	 
	    
	    
	    public Interface_java_8(String brand) {
		super();
		this.brand = brand;
	}
	    @Override
	    public String turnAlarmOn() {
	        return Vehicle.super.turnAlarmOn();
	    }

	    @Override
	    public String turnAlarmOff() {
	        return Vehicle.super.turnAlarmOff();
	    }

	    @Override
	    public String speedUp() {
	        return "The car is speeding up.";
	    }
	    
	    @Override
	    public String slowDown() {
	        return "The car is slowing down.";
	    }

		@Override
	    public String getBrand() {
	        return brand;
	    }
	    
	    
	    public static void main(String[] args) { 
	        Vehicle car = new Interface_java_8("BMW");
	        System.out.println(car.getBrand());
	        System.out.println(car.speedUp());
	        System.out.println(car.slowDown());
	        System.out.println(car.turnAlarmOn());
	        System.out.println(car.turnAlarmOff());
	    }

		
}
