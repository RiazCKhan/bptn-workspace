//package tuesday;
//
//public class SuperKey {
//
//	public static void main(String[] args) {
//
//		Car mikesCar = new Car("Blue", "BMW", "Wheel");
//		Bike tomsBike = new Bike("Red", "Honda", "Handle");
//		
//		mikesCar.display();
//		tomsBike.display();
//
//	}
//}
//
//class TestClass {
//
//}
//
//class Vehicle {
//	String color;
//	String brand;
//
//	public Vehicle(String color, String brand) {
//		this.color = color;
//		this.brand = brand;
//	}
//
//	void display() {
//		System.out.println("Vehicle [ color = " + color + ", brand = " + brand + " ]");
//	}
//	
//}
//
//class Car extends Vehicle {
//	String steeringWheel;
//
//	public Car(String color, String brand, String steeringWheel) {
//		super(color, brand);
//		this.steeringWheel = steeringWheel;
//	}
//}
//
//class Bike extends Vehicle {
//
//	String bikeHandle;
//
//	public Bike(String color, String brand, String bikeHandle) {
//		super(color, brand);
//		this.bikeHandle = bikeHandle;
//	}
//
//}
