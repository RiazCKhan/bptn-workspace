package friday;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {

		int initalInput;
		int result;
		
		
		do {
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 for Reverse a String");
			System.out.println("Press 3 for Concatenate Two String");
			System.out.println("Press 4 for String Comparison");
			System.out.println("Press 5 for Calculate the Length of String");
			System.out.println("Press 9 to Quit");

			
			Scanner myScanIntObj = new Scanner(System.in);
			Scanner myScanObj = new Scanner(System.in);
			initalInput = myScanIntObj.nextInt();
			
			
			if (initalInput == 1) {
				System.out.println("Enter Word...");
				String firstInput = myScanObj.nextLine();
				
				String reverseStr = new StringBuilder(firstInput).reverse().toString();
			
				if (firstInput.equals(reverseStr)) {
				System.out.println("This String is a Palindrome");
				} else {
				System.out.println("This String is NOT a Palindrome");
				}
			
			}
			
			else if (initalInput == 2) {
				System.out.println("Enter Word...");
				String firstInput = myScanObj.nextLine();
				
				String reverseStr = new StringBuilder(firstInput).reverse().toString();
				System.out.println("Here is your reversed word " + reverseStr);
				
			}
			
			else if (initalInput == 3) {
				System.out.println("Enter First Word...");
				String firstInput = myScanObj.nextLine();
				System.out.println("Enter Second Word...");
				String secondInput = myScanObj.nextLine();
				
				System.out.println("Concatendated String = " + firstInput + secondInput);
				
			}
			
			else if (initalInput == 4) {
				System.out.println("Enter First Word...");
				String firstInput = myScanObj.nextLine();
				System.out.println("Enter Second Word...");
				String secondInput = myScanObj.nextLine();
				
				System.out.println("Comparison Result = " + firstInput.compareTo(secondInput));
				
			}
			
			else if (initalInput == 5) {
				System.out.println("Enter Word...");
				String firstInput = myScanObj.nextLine();
				
				System.out.println("This is the character count of the provided word = " + firstInput.length());
				
			}
			
			else {
				System.out.println("Invalid input...");
			}
			
			
		} while(initalInput != 9);
		
		
	}

}
