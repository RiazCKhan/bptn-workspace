package friday;

import java.util.Scanner;

public class AssessingDistance {

	public static void main(String[] args) {
		
        Scanner metersInput = new Scanner(System.in);
        Scanner hoursInput = new Scanner(System.in);
        Scanner minutesInput = new Scanner(System.in);
        Scanner secondsInput = new Scanner(System.in);
		
		System.out.println("Enter Distance in Meters");
		double meters = metersInput.nextDouble();
		
		System.out.println("Enter Hours");
		double hours = hoursInput.nextDouble();
		
		System.out.println("Enter Minutes");
		double minutes = minutesInput.nextDouble();
		
		System.out.println("Enter Seconds");
		double seconds = secondsInput.nextDouble();
		
		double time = ( hours / 3600 ) + ( minutes / 60 ) + seconds;
		
		System.out.println("Your speed in meters/seconds is " + meters/time);
		System.out.println("Your speed in km/h is " + (meters * .001)/(time * 60));
		System.out.println("your speed in miles/h" + ((meters * .001) * 0.621371) + (time * 60));
	}

}
