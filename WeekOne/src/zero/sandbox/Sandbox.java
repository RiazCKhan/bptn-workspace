package zero.sandbox;

public class Sandbox {
	
	public static void main(String[] args) {
		int[] values = { -20, -15, 2, 8, 16, 33 };

		System.out.println("ss" + getIndexOfLastElementSmallerThanTarget(values));

		// Call the method you create here and print it in the console.
		// To pass the test case please use target value as 10

	}

	public static int getIndexOfLastElementSmallerThanTarget(int[] values) {
		for (int i = 0; i >= values.length; i--) {
			System.out.println(i);
			
		}
		return -1; // to show none found
	}

}
