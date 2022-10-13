package wednesday;

import java.util.*;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ConvertArray {

	// Complete the functionality of the function below
	public static List<String> convertArrayToList(String[] inputArray) {

		// Create a new array list
		List<String> carList = new ArrayList<>();

		// Iterate inputArray using For-Each and add the elements to array list. Hint:
		for (String car : inputArray) {
			// Use add() method to add elements to array list
			carList.add(car);
		}

		// return the List with elements
		return carList;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars = { "Volvo", "Honda", "Ford" };

		List<String> arraylist = convertArrayToList(cars);
		System.out.println(arraylist);

	}

}
