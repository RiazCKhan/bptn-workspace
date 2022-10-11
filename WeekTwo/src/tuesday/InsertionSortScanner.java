package tuesday;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortScanner {

	public static void main(String[] args) {
		
		System.out.println("Enter a number...");
		
		Scanner myScanObj = new Scanner(System.in);
		int userInput = myScanObj.nextInt();
		
		int[] userArray = getUserArray(userInput);
		int[] sortedUserArray = insertionSort(userArray);
		
		System.out.println(Arrays.toString(sortedUserArray));
	}

	public static int[] getUserArray(int number) {

		String numString = Integer.toString(number);

		int[] userArray = new int[numString.length()];

		for (int i = 0; i < numString.length(); i++) {
			userArray[i] = numString.charAt(i) - '0';
		}
		return userArray;
	}

	public static int[] insertionSort(int[] array) {

		for (int i = 0; i < array.length; i++) {

			int tempVal = array[i];
			int possibleIndex = i;

			while (possibleIndex > 0 && tempVal < array[possibleIndex - 1]) {
				array[possibleIndex] = array[possibleIndex - 1];
				possibleIndex = possibleIndex - 1;

			}
			array[possibleIndex] = tempVal;
		}
		return array;
	}

}
