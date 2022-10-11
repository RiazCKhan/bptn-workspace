package thursday;

import java.util.Random;

public class RandomNumGen {

	public static void main(String[] args) {

		Random randomNum = new Random();
		int numLimit = 10;
		int loopCount = 10;
		
		String result = "";

		for (int i = 1; i < loopCount; i++) {
			int randomInt = randomNum.nextInt(numLimit);
			
			Integer.toString(randomInt);
			result += randomInt;
			
		}
		System.out.println("Here is your random Number = " + result);
	}

}
