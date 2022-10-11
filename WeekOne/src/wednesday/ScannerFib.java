package wednesday;

import java.util.Scanner; // import the Scanner class

public class ScannerFib {

	public static void main(String[] args) {

		System.out.println("Enter of Number");

		Scanner myScanObj = new Scanner(System.in);
		int a = 0, b = 1, userInput = myScanObj.nextInt();

		for (int i = 3; i <= userInput; i++) {

			int c;
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
