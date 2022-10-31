package monday;

public class BinSearch {
	
	public static int binarySearch(int[] array, int target) {
	       int start = 0; // start of array index
	       int end = array.length - 1; // end of array index
	       int middle = 0; // declare and initialize variable

	       while (start <= end) {
	            //  reassign middle
	           middle = (start + end) / 2;

	           if (target < array[middle]) {
	            // shift end index position
	               end = middle - 1;
	           } else if (target > array[middle]) {
	            // shift start index position
	               start = middle + 1;
	           } else if (target == array[middle]) {
	            // return answer  
	               return middle;
	           }
	       }
	       // Index value not found   
	       return -1;
	}
	

	public static void main(String[] args) {
		
		int key = 3;
		int[] arr1 = { 2, 3, 5, 9, 12, 15 };
		
		int index = binarySearch(arr1, key);
		System.out.println(index);
		
		key = 110;
		int[] arr2 = { 10, 20, 30, 50, 60, 80, 110, 130, 140, 170 };
		
		index = binarySearch(arr2, key);
		System.out.println(index);
		
		key = 175;
		int[] arr3 = { 10, 20, 30, 40, 60, 110, 120, 130, 170 };
		
		index = binarySearch(arr3, key);
		System.out.println(index);
		
		
	}

}
