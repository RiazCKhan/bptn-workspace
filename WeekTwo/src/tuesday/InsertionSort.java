package tuesday;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] userArray = {2, 5, 7, 4, 0, 5, 9};
		userArray = insertionSort(userArray);
		System.out.println(Arrays.toString(userArray));
	}
	
	//	Access Modifiers, e.g., Public
	//  Static Keyword	
	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			
			int tempVal = array[i];
			int possibleIndex = i;
			
			while (possibleIndex > 0 && tempVal < array[possibleIndex -1]) {
				
				array[possibleIndex] = array[possibleIndex -1];
				possibleIndex = possibleIndex -1;
			}
			
			array[possibleIndex] = tempVal;
			
		}
		return array;
	}

}
