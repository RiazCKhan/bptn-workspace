package wednesday;
import java.util.Scanner;

public class PalindromeStr {

	public static void main(String[] args) {

		System.out.println("Enter Word...");

		Scanner myScanObj = new Scanner(System.in);
		String userInput = myScanObj.nextLine();

		String reverseStr = "";
		char character;
		
//		String reverseStrTwo = new StringBuilder(userInput).reverse().toString();

		for (int i = 0; i < userInput.length(); i++) {
			character = userInput.charAt(i);
			reverseStr = character + reverseStr;

		}

		if (userInput.equals(reverseStr)) {
			System.out.println("This String is a Palindrome");
		} else {
			System.out.println("This String is NOT a Palindrome");
		}

	}

}
