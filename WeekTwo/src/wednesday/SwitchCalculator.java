package wednesday;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int operation = 0;
		double result;

		do {
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");

			operation = s.nextInt();

			System.out.println("Operation: Enter First Number");
			double firstNum = s.nextDouble();
			System.out.println("Operation: Enter Second Number");
			double secondNum = s.nextDouble();

			switch (operation) {

			case 1:
				System.out.println(result = firstNum + secondNum);
				break;

			case 2:
				System.out.println(result = firstNum - secondNum);
				break;

			case 3:
				System.out.println(result = firstNum * secondNum);
				break;

			case 4:
				System.out.println(result = firstNum / secondNum);
				break;
				
			default:
				System.out.println("Error: Operation Not Found");

			}

		} while (operation <= 4);

	}

}
