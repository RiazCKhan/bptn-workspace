package tuesday;

public class SyncBlock {

	public static void main(String[] args) {
		
		Sync obj1 = new Sync();
		SyncTwo obj2 = new SyncTwo();
		
		obj1.start();
		obj2.start();

	}

}

class Sync extends Thread {
	
	@Override
	public void run() {
		countEven();
	}
	
	public void countEven() {
		
//		synchronized (this) 
		{
			
			int count = 0;
			
			while (10 > count) {
				
				if (count % 2 == 0)
				System.out.println("Even " + count);
				
				count++;
			}
		}
	}
}

class SyncTwo extends Thread {
	
	@Override
	public void run() {
		countOdd();
	}
	
	public void countOdd() {
		
//		synchronized (this)
		{
			
			int count = 0;
			
			while (10 > count) {
				
				if (count % 2 != 0)
				System.out.println("Odd " + count);
				
				count++;
			}
		}
	}
	
}