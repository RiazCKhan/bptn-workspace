package monday;

public class ThreadExampleOne {

    public static void main(String[] args) {

        ThreadExample t1 = new ThreadExample(10);
        t1.start();

    }

}

// 1. Create a Class
class ThreadExample extends Thread {

// 2. Create a method and extend it with the Thread class?

// 3. Declare limitToStop
    private int limitToStop;

// 4. Create Constructor
    ThreadExample(int limitToStop) {
        super();
        this.limitToStop = limitToStop;
    }

    // 5. Implement Run Method
    @Override 
    public void run() {

        int count = 0;

        try {
            for (int index = 0; count < limitToStop; index++) {
                if (index % 2 != 0) {
                    // 6. Call Sleep Method
                    Thread.sleep(100);
                    // 7. Print Odd Numbers
                    System.out.println(index);
                    count++;
                }
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

}