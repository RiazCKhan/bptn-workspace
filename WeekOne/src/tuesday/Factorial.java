package tuesday;

public class Factorial {

	public static void main(String[] args) {

		int i;
		int result = 1;
		int number = 5;

		for (i = 1; i <= number; i++) {
			result = result * i;
		}
		System.out.println(result);
	}
}
