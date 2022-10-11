package wednesday;

public class ExamplePrintDiamond {

	public static void main(String[] args) {

		// Initializing the variable with the number at which
	    // the number of stars will be maximum. In this case, the
	    // stars will increase till 7th row, 7th row will have max
	    // stars and the stars will start decreasing after 7th row.
	    int numberOfRows = 6;
	    

	    int i, j;

	    //This loop will print the first half of the diamond pattern
	    for (i = 1; i <= numberOfRows; i++) {

	      // This will print white spaces, 6 spaces in first row
	      // 5 spaces in second row and so on
	      for (j = 1; j <= numberOfRows - i; j++) {
	        System.out.print(" ");
	      }

	      // This will print the stars after the whites paces printed
	      // by above loop. It will print 1 star in first row, 3 in second
	      // 5 in third and so on
	      for (j = 1; j <= i * 2 - 1; j++) {
	        System.out.print("*");
	      }

	      // Move the cursor to new line after each row
	      System.out.println();
	    }

	    //This loop will print the second half of the diamond pattern
	    for (i = numberOfRows - 1; i > 0; i--) {

	      // This will print white spaces in second half of triangle pattern
	      for (j = 1; j <= numberOfRows - i; j++) {
	        System.out.print(" ");
	      }

	      // This will print stars in second half of triangle pattern
	      for (j = 1; j <= i * 2 - 1; j++) {
	        System.out.print("*");
	      }

	      // Move the cursor to new line after each row
	      System.out.println();
	    }
		
		
	}

}
