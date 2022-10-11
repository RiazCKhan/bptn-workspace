package tuesday;
import java.util.Scanner;

public class DisplayNegativeNums {

	public static void main(String[] args) {

		Scanner myScanObj = new Scanner(System.in);
		String luckyNumStr;
		
		System.out.println("What is your lucky number?");
		luckyNumStr = myScanObj.nextLine();
		// Could use nextInt(); to Typecast the input to integer 			
		// See Class Example5		
		
		int luckyNum = Integer.parseInt(luckyNumStr);
		
		if (luckyNum > 0) {
			System.out.println(luckyNum);
		} else {
			System.out.println("Yoo your lucky number is negative?!");
		}
	}

}
