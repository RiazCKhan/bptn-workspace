//package thursday;
//
//import java.util.Scanner;
//
//class FileExtensionException extends Exception {
//	FileExtensionException(String message) {
//		super(message);
//	}
//}
//
//public class ExceptionExercise {
//
//	static void getFileName() throws FileExtensionException {
//		Scanner s = new Scanner(System.in);
//
//		System.out.println("Enter File Name...");
//		String userInput = s.nextLine();
//		
//		System.out.println(userInput.endsWith(".txt"));
//
//		if (userInput.endsWith(".txt")) {
//			System.out.println("Great File Name");
//		} else {
//			throw new FileExtensionException("File doesn't have .txt extension");
//		}
//	}
//
//	public static void main(String[] args) {
//
//		try {
//			getFileName();
//		} catch (FileExtensionException message) {
//			System.out.println("Exception occured" + message);
//		}
//
//	}
//
//}
