package wednesday;

import java.util.Scanner;

public class ReduceNumToZero {

	public static void main(String[] args) {

		System.out.println("Enter a Number");

		Scanner myScanObj = new Scanner(System.in);
		int userInput = myScanObj.nextInt();

		int result = userInput;

		for (int i = 1; i < userInput; i++) {

			if (result == 2) {

				result = result - 1;

			} else if (result % 2 == 0) {

				System.out.println("even");

				result = result / 2;

			} else if (result % 2 != 0) {

				System.out.println("odd");

				result = result - 1;

			}

			if (result == 0) {
				
				System.out.println("Number of iterations " + i);
				
				break;
			}
		}

	}

}
