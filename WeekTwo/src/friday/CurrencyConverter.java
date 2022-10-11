package friday;

import java.util.Scanner;

public class CurrencyConverter {

	// --- Conversion Table
	// 1 CAD => 0.73 USD
	// 1 CAD => 1.13 AUD
	// 1 CAD => 0.65 GBP

	public static void main(String[] args) {

		Scanner currencyconverter = new Scanner(System.in);

		System.out.println("Enter CAD value:");
		int amount = currencyconverter.nextInt();

		System.out.println("Press 1 for USD equivalent, 2 for AUD equivalent or 3 for GBP equivalent");
		int currency = currencyconverter.nextInt();

		switch (currency) {
		case 1:
			double result = 0.73 * amount;
			System.out.println("The USD equivalent is " + result);
			break;

		case 2:
			result = 1.13 * amount;
			System.out.println("The AUD equivalent is " + result);
			break;

		case 3:
			result = 0.65 * amount;
			System.out.println("The GBP equivalent is " + result);
			break;

		default:
			System.out.println("You have not entered a valid Currency Option");

		}

		currencyconverter.close();
	}

}
