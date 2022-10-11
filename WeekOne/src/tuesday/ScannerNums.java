package tuesday;
import java.util.Scanner;

public class ScannerNums {
	public static void main(String[] args) {

		Scanner myScanObj = new Scanner(System.in);
		int luckyNum;
		
		System.out.println("What is your lucky number?");
		luckyNum = myScanObj.nextInt(); 			
		
		if (luckyNum > 0) {
			System.out.println("Is this your lucky number? " + luckyNum);
		} else {
			System.out.println("Yoo your lucky number is negative?!");
		}
	}
}
