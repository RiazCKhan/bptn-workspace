package monday;

public class InterfaceExample {

	public static void main(String[] args) {

		MyThreadInterface interfaceObj = new MyThreadInterface();

		Thread t1 = new Thread(interfaceObj);
		System.out.println("Thread Created");
		t1.start();
		System.out.println("Thread Started");
	}

}

class MyThreadInterface implements Runnable {

	public MyThreadInterface() {
		super();
	}

	@Override
	public void run() {
		System.out.println("Thread Ended");
	}

}