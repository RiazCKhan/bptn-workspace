package tuesday;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		
		Scanner myScanObj = new Scanner(System.in);
		int userInput = myScanObj.nextInt();

		String loopCount = Integer.toString(userInput);

		int[] userArray = new int[loopCount.length()];

		for (int i = 0; i < loopCount.length(); i++) {
			// Subtract '0' to get true Integer instead of Unicode value of Input
			userArray[i] = loopCount.charAt(i) - '0';
//			System.out.println("user array at i " + userArray[i]);
//			System.out.println("loopCount char at i " + loopCount.charAt(i));
		}
		System.out.println(Arrays.toString(userArray));

	}

}
