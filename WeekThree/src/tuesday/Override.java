package tuesday;

public class Override {

	public static void main(String[] args) {

		// step 14: Create an instance of a car
		Car car = new Car("White", "Audi", "ChromeColored");

		// step 15:Call print function of the car
		car.print();

		// step 16:Create an instance of Bike .
		Bike bike = new Bike("Grey", "BMW", "SilverColored");

		// step 17:Call print function of Bike
		bike.print();
	}

}

class Vehicle {

	String color;
	String brand;

	Vehicle(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}

	void print() {
		System.out.println(color + "" + brand);
	}
}

class Car extends Vehicle {

	String steerWheel;

	Car(String color, String brand, String steerWheel) {
		super(color, brand);
		this.steerWheel = steerWheel;
	}

	void print() {
		System.out.println(color + " " + brand + " " + this.steerWheel);

	}
}

class Bike extends Vehicle {

	String bikeHandle;

	Bike(String color, String brand, String bikeHandle) {
		super(color, brand);
		this.bikeHandle = bikeHandle;
	}

	void print() {
		System.out.println(color + " " + brand + " " + this.bikeHandle);

	}
}
