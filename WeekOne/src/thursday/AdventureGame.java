package thursday;

import java.util.Scanner;

public class AdventureGame {

	public static void main(String[] args) {
        System.out.println("You wake up in the middle of the night and hear a strange voice. Do you walk North (n) to your bathroom, East (e) to check the window, South (s) to your Bedroom Door or West (w) to hide in your Closet");

        System.out.println("n / e / s / w ...");

        Scanner myScanObj = new Scanner(System.in);
        String userInput = myScanObj.nextLine();

        if (userInput.equals("n")) {
            System.out.println("Your Cat attacks your big toe. End of Adventure");
        }
        else if (userInput.equals("e")) {
            System.out.println("You close your window. End of Adventure");
        }
        else if (userInput.equals("s")) {
            System.out.println("You lock your bedroom door. End of Adventure");
        }
        else if (userInput.equals("w")) {
            System.out.println("You dial 911. End of Adventure");
        }
        else {
        	System.out.println("Invalid Input... GAME OVER");
        }

	}

}
