package thursday;

public class ExceptionHandle {

	int getValue() {
		int[] array = { 1, 2, 3, 4, 5 };
		return array[5];
	}

	void returnArrayValue() {

		try {
			int result = getValue();
			System.out.println(result);

		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println(error.getMessage());
//			error.printStackTrace();
		}

	}

	public static void main(String[] args) {

		ExceptionHandle callException = new ExceptionHandle();

		callException.returnArrayValue();

	}

}
