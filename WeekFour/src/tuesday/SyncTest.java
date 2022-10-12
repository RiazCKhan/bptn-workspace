package tuesday;

public class SyncTest {

	public static void main(String[] args) {

		CountEven object = new CountEven();
		
		TheThreadOne t1 = new TheThreadOne(object);
		TheThreadTwo t2 = new TheThreadTwo(object);
		
		t1.start();
		t2.start();
		
	}

}

class CountEven {

	public void getEvenNumbers(int count) {

		synchronized (this) {

			for (int i = 1; i <= count; i++) {

				if (i % 2 == 0) {

					System.out.println("Even " + i);
				}
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

class TheThreadOne extends Thread {
	CountEven counteven;
	
	TheThreadOne(CountEven counteven) {
		this.counteven = counteven;
	}
	
	@Override
	public void run() {
		counteven.getEvenNumbers(10);
	}
	
}

class TheThreadTwo extends Thread {
	CountEven counteven;
	
	TheThreadTwo(CountEven counteven) {
		this.counteven = counteven;
	}
	
	@Override
	public void run() {
		counteven.getEvenNumbers(30);
	}
	
}