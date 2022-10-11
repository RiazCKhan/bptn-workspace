package friday;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int initalInput;
		int result;
		
		
		do {
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for finding Square");
			System.out.println("Press 6 for finding Square root");
			System.out.println("Press 7 for finding Reciprocal");
			System.out.println("Press 9 to Quit");
			
			Scanner myScanObj = new Scanner(System.in);
			initalInput = myScanObj.nextInt();
			
			
			if (initalInput == 1) {
				System.out.println("Enter First Number...");
				int firstInput = myScanObj.nextInt();
				
				System.out.println("Enter Second Number...");
				int secondInput = myScanObj.nextInt();
				
				System.out.print(firstInput + " + " + secondInput + " = ");
				System.out.println(result = firstInput + secondInput);
			}
			
			else if (initalInput == 2) {
				System.out.println("Enter First Number...");
				int firstInput = myScanObj.nextInt();
				
				System.out.println("Enter Second Number...");
				int secondInput = myScanObj.nextInt();
				
				if (secondInput < firstInput) {
					System.out.println("Error first input smaller than second input");
				}
				
				System.out.print(firstInput + " - " + secondInput + " = ");
				System.out.println(result = firstInput - secondInput);
				
			}
			
			else if (initalInput == 3) {
				System.out.println("Enter First Number...");
				int firstInput = myScanObj.nextInt();
				
				System.out.println("Enter Second Number...");
				int secondInput = myScanObj.nextInt();
				
				System.out.print(firstInput + " * " + secondInput + " = ");
				System.out.println(result = firstInput * secondInput);
			}
			
			else if (initalInput == 4) {
				System.out.println("Enter First Number...");
				int firstInput = myScanObj.nextInt();
				
				System.out.println("Enter Second Number...");
				int secondInput = myScanObj.nextInt();
				
				if (secondInput < firstInput) {
					System.out.println("Error first input smaller than second input");
				}
				
				System.out.print(firstInput + " / " + secondInput + " = ");
				System.out.println(result = firstInput / secondInput);
			}
			
			else if (initalInput == 5) {
				System.out.println("Enter First Number...");
				int firstInput = myScanObj.nextInt();
				
				System.out.print(firstInput + " * " + firstInput + " = ");
				System.out.println(result = firstInput * firstInput);
			}
			
			else if (initalInput == 6) {
				System.out.println("Enter First Number...");
				double firstInput = myScanObj.nextInt();
				double sqResult;
				
				System.out.print(firstInput + " sqrt = ");
				System.out.println(sqResult = Math.sqrt(firstInput));
			}
			
			else if (initalInput == 7) {
				System.out.println("Enter First Number...");
				double firstInput = myScanObj.nextInt();
				double sqResult;
				
				System.out.print("Reciprocal of " + firstInput + " is " + 1/firstInput);
			}
			
			else {
				System.out.println("Goodbye!");
			}
			
			
		} while(initalInput != 9);
		
		
	}

}