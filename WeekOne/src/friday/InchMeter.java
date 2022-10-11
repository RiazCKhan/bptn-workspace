package friday;

import java.util.Scanner;

public class InchMeter {

	public static void main(String[] args) {
			
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input a value in inches to convert to meter: ");
        double inch = userInput.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
		
	}

}
