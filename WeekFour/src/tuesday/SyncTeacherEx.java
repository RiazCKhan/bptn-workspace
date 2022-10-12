package tuesday;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Id {
	
	
	public static synchronized void insertNextId(List<Integer> list) {
		
		int max = 0;
		
		// 1. find the maximum id in the list.
		
		for (int id: list) {
			if (id > max) {
				max = id;
			}
		}
		
		// 1. Increase the maximum id by 1 unit and add it to the list
		list.add(++max); // This Syntax is Pre-increment 
		
		// 2. Increase the maximum id by 1 unit AFTER line has executed
		// This is Post-increment...		
		//list.add(max++); // max = 8 
		                   // max = 9
		// The wrong max would be added if Post-increment is used as above.		
		
		System.out.println("Inserted: " + Thread.currentThread().getName() + ", " + max);
	}
	
}

class MyThread extends Thread {
	
	List<Integer> list;

	public MyThread(String name, List<Integer> list) {
		super(name);
		this.list = list;
	}
	
	@Override
	public void run() {

		System.out.println("Running: " + this.getName());
		
		Id.insertNextId(this.list);
		
		System.out.println("Exiting: " + this.getName());
		
	}
}
public class SyncTeacherEx {
	
	public static void main(String[] args) throws InterruptedException {

		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(5,1,4,3,6,2));
		
		MyThread t1 = new MyThread("T1",list);
		MyThread t2 = new MyThread("T2",list);
		
		t1.start();
		
		//Thread.sleep(1000);
		
		t2.start();
		
		// We need to wait until the threads die
		t1.join(); //Waits for t1 to die.
		t2.join(); //Waits for t2 to die.
		
		System.out.println(list);		
	}

}