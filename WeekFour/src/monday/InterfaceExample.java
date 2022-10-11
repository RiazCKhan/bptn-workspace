package monday;

public class InterfaceExample {

	public static void main(String[] args) {

		MyThreadInterface interfaceObj = new MyThreadInterface();

		Thread t1 = new Thread(interfaceObj);
		System.out.println("Thread Created");
		System.out.println("Thread Started");
		t1.start();
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