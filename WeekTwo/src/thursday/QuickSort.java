package thursday;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
//		Reference: https://www.geeksforgeeks.org/quick-sort/
		
//		Input Array
		int[] input = { 3, 4, 6, 1, 2, 7, 8, 9, 5 };
//		Find Length of Array -1 
		int length = input.length -1;
//		Update Input Array by calling quickSort Method
		input = quickSort(input, 0, length);
		System.out.println(Arrays.toString(input));
	}

//	Method used to Swap Variables
//	--- NOT IN USE --- swap Method for Manual Swap Implementation 
//	static void swap(int[] arr, int i, int j) {
//		int temp = arr[i];
//		arr[i] = arr[j];
//		arr[j] = temp;
//
//	}
	
/*
 The partition function will Initialize Pivot point, place Pivot element at its correct position.
 In other words, the middle index. Place all elements smaller than the Pivot to the left.
 All elements greater than the Pivot to the right
 */
	public static int partition(int[] array, int start, int end) {

//		Declare Pivot Point
		int pivot = array[end];

		/*
		 The index of the smaller element will indicate the 
		 correct/right/(middle?) position of the pivot found so far 
		 */
		int i = start - 1;
		
		for (int j = start; j <= end - 1; j++) {

//			If current element is smaller -> Pivot
			if (array[j] < pivot) {
//				Increment Index of smaller element
				i++;
//				swap(array, i, j);
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
//		swap(array, i + 1, end);
		int temp = array[i + 1];		
		array[i + 1] = array[end];
		array[end] = temp;
		return i + 1;
	}

	public static int[] quickSort(int[] array, int start, int end) {

//		partitionIndex = array[p] which is determined by the partition Method
		if (start < end) {
			int partitionIndex = partition(array, start, end);
			
//			Divide and conquer = separately sort elements before and after partitionIndex
			quickSort(array, start, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, end);
		}
		return array;

	}

}
