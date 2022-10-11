package thursday;

import java.util.Arrays;

public class ExceptionHandleExample2 {

	void getValue() {

		int[] array = { 1, 2, 3, 4, 5 };

		try {

			System.out.println("First Try...");

			try {

				System.out.println("Second Try...");
				System.out.println(Arrays.toString(array));
				System.out.println(array[5]);

			} catch (NullPointerException error) {
				System.out.println("Second Catch...");
				System.out.println("Check Random Exception???");
				error.printStackTrace();

			}

		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Second Catch...");
			error.printStackTrace();

		} 
		
		catch (Exception error) {
			error.printStackTrace();
		}
		
		finally {
			System.out.println("All done");
		}

	}

	public static void main(String[] args) {

		ExceptionHandleExample2 callMethod = new ExceptionHandleExample2();

		callMethod.getValue();

	}

}





