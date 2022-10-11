package tuesday;

public class Fib {

	public static void main(String[] args) {

	    int num1 = 0;
	    int num2 = 1;
	    int loopCount = 10;

	    for (int i = 2; i < loopCount; i++) {
		        int num3 = 0;
		        num3 = num1 + num2;
		        System.out.println(num3);
		        num1 = num2;
		        num2 = num3;
	    }
		
	}

}
