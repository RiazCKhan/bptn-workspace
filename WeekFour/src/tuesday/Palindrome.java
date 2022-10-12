package tuesday;

public class Palindrome {

	public static boolean isPalindrome(int num) {
		int reversedNum = 0;
		int remainder;

		// store the number to originalNum
		int originalNum = num;

		// get the reverse of originalNum
		// store it in variable
		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}

		// check if reversedNum and originalNum are equal
		if (originalNum == reversedNum) {
			System.out.println(originalNum + " is Palindrome.");
			return true;
		} else {
			System.out.println(originalNum + " is not Palindrome.");
			return false;
		}

	}

	public static void main(String[] args) {
		
		

	}
}