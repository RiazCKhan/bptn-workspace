package thursday;

public class DisplayEvenNums {

	public static void main(String[] args) {

		int i = 1;

		System.out.println("Printing the  even numbers from 1 to 100: ");

		while (i <= 100) {
			i++;
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
