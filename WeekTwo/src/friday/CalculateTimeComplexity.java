package friday;

public class CalculateTimeComplexity {
	public static void main(String[] args) {

		System.out.println("Answer = " + getCount(4));
	}

	public static int getCount(int n) {
		int sum = 0;

		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 0;
		} else {
			return getCount(n - 1) + getCount(n - 2) + getCount(n - 3);
		}
	}

}
