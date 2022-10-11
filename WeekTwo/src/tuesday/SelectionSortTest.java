package tuesday;

import java.util.Arrays;

public class SelectionSortTest {

	public static void main(String[] args) {
		int[] arr1 = { 3, 86, -20, 14, 40 };
		System.out.println(Arrays.toString(arr1));
		selectionSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}

	public static void selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[minIndex]) {

					minIndex = j;

				}

			}

// It’s time to swap values

//			-- Carlos Solution --

//			int temporaryVal = array[i]; // 1. Store the value at index " i " in a temporary variable.

//			array[i] = array[minIndex]; // 2. Overwrite the value at index " i " with the minimum number found.

//			array[minIndex] = temporaryVal; // 3. Replace the value at minIndex with the value in temporary variable

			
			
//			-- My Solution --

			int tempSmallestVal = array[minIndex]; // 1. Assign smallestVal to array[minIndex]

			array[minIndex] = array[i]; // 2. (Update) Assign value found at array[minIndex] to array[i] 
										// i.e., Swap larger value to new position -- later in array
			
			array[i] = tempSmallestVal; // 3. Assign the value of array[i] to the smallest Value
										// i.e., array[i] being the current iteration 'spot' in array

		}

	}

}
