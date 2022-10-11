package wednesday;

public class PrintDiamond {

	public static void main(String[] args) {
		
//		Call createDiamond Method with Number Parameter to generate Diamond
		createDiamond(6);

	}

	public static void createDiamond(int num) {

//		Initialize variable to represent max number of stars (middle row of diamond)
		int maxNumOfStars = 6;

//		Declare variables to represent "Grid"
//		Do not use i & j as per instructions
//		row = i
//		column = j
		int row, column;

//		Create first loop block for first half of diamond (triangle)
		for (row = 1; row <= maxNumOfStars; row++) {

//		Create second loop to print required white space
			for (column = 1; column <= maxNumOfStars - row; column++) {
				System.out.print(" ");
			}
//		Create third loop to print required stars
			for (column = 1; column <= row * 2 - 1; column++) {
				System.out.print("*");
			}
//		Create new line
			System.out.println();

		}
//		Create second loop block for second half of diamond (triangle)
		for (row = maxNumOfStars - 1; row > 0; row--) {
			
//		Create second loop to print white space
			for (column = 1; column <= maxNumOfStars - row; column++) {
				System.out.print(" ");
			}
//		Create third loop to print stars
			for (column = 1; column <= row * 2 - 1; column++) {
				System.out.print("*");
			}
//		Create new line
			System.out.println();
		}

	}

}
