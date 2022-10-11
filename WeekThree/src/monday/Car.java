package monday;

public class Car {

	public static void main(String[] args) {
		
		Car sweetRide = new Car();
		
		sweetRide.setColor("Blue");
		sweetRide.getColor();
		
		sweetRide.airConON();
		sweetRide.airConStatus();
		
		sweetRide.engineON();
		sweetRide.engineStatus();

	}

	String carColor;
	boolean airCon;
	boolean engine;

	public void setColor(String color) {
		carColor = color;
	}

	public void getColor() {
		System.out.println("The color of your car is: " + carColor);
	}

	public void airConON() {
		airCon = true;
	}

	public void airConOFF() {
		airCon = false;
	}

	public void airConStatus() {
		System.out.println("Is the AC on? " + airCon);
	}

	public void engineON() {
		engine = true;
	}

	public void engineOFF() {
		engine = false;
	}

	public void engineStatus() {
		System.out.println("Is the engine on? " + engine);
	}

}

/*
 * 
 * WAP 1. create a class called Car 2. Car will have properties [x] color [x] ac
 * [x] engine Create following functions - setColor - getColor - acStatus -
 * turnAcOn - turnAcOff - engineStatus - turnEngineOn - turnEngineOff 3. Get all
 * the properties as required. - Print engine status and Air conditioner status.
 * 
 */