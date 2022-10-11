package friday;

class Example {

	public static void sayGoodbye() {
		System.out.println("Goodbye");
	}
}

public class StaticMethodTutorial {

//	Static Methods can be called without creating an Object

	public static void validateHeight(int height) {
		if (height >= 100) {
			System.out.println("You are tall enough to ride the roller coaster");
		} else {
			System.out.println("Try again next year");
		}
	}

//	Instance Methods require and Object to be called

	public void sayHello(String name) {
		if (name.length() > 0) {
			System.out.println("Hello " + name);
		} else {
			System.out.println("Please provide a name");
		}
	}

	public static void main(String[] args) {

//		Static Method being called without Object
		validateHeight(10);

//		Static Method being called with Object
//		StaticMethodTutorial object = new StaticMethodTutorial();
//		object.validateHeight(100);

//		Instance
		StaticMethodTutorial object2 = new StaticMethodTutorial();
		object2.sayHello("THANK YOU FOR COMING TO OUR PRESENTATION!");
		
		Example.sayGoodbye();

	}

}
