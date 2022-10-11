package friday;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

		Random rand = new Random();
		int upperLimit = 101;
		int answer = rand.nextInt(upperLimit);

		System.out.println("Enter your Number...");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		
		if (input < 0 || input > 100) {
			System.out.println("Your Number is Out of Bounds");
			return;
		}
		
		int numOfGuesses = 5;
		
		for (int guess = 0; guess <= numOfGuesses; guess++) {
			System.out.println("Enter your ");
			int userGuess = s.nextInt();

			if (userGuess != answer && userGuess > answer) {
				System.out.println("Please check; your guess was too HIGH, Try some lower numbers.");
			} else if (userGuess != answer && userGuess < answer) {
				System.out.println("Please check; your guess was too LOW, try some higher numbers. ");
			} else if (userGuess == answer) {
				System.out.println("Perfect! You got it Right!");
				break;
			}

		}

	}

}
