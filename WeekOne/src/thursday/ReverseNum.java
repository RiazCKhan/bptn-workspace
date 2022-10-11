package thursday;

public class ReverseNum {

	public static void main(String[] args) {

		int inputNum = 143;
		int reversedVal = 0;
		int remainderVal = 0;

		while (inputNum > 0) {
			reversedVal = (reversedVal * 10) + (inputNum % 10);
			inputNum = inputNum / 10;

			if (inputNum % reversedVal == 0) {

				System.out.println(reversedVal);
			}
		}
	}
}
