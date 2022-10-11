package monday;

public class ThreadExampleTwo {
	public static void main(String[] args) {
		ThreadExamplePlus t1 = new ThreadExamplePlus();
		t1.start();
	}
}

class ThreadExamplePlus extends Thread {
	public void run() {
		System.out.println("Hi");
	}
}