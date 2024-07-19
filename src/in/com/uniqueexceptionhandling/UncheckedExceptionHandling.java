package in.com.uniqueexceptionhandling;

import java.util.Scanner;

/**
 * Author: Aadarsh Patil Description: This class demonstrates handling unchecked
 * exceptions during division operation.
 */
public class UncheckedExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter numerator: ");
		int numerator = scanner.nextInt();
		System.out.print("Enter denominator: ");
		int denominator = scanner.nextInt();
		try {
			// Attempting to divide by the user-provided denominator
			int result = numerator / denominator;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			// Handling ArithmeticException for division by zero
			System.err.println("Error: Division by zero is not allowed.");
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}

//If the user enters:
//	Enter numerator: 10
//	Enter denominator: 2
//	Result: 5
//------------------------------
//If the user enters:
//Enter numerator: 10
//Enter denominator: 0
//       The console output will be:
//    	   Error: Division by zero is not allowed.
//    	   java.lang.ArithmeticException: / by zero
//    	       at in.com.uniqueexceptionhandling.UncheckedExceptionHandling.main(UncheckedExceptionHandling.java:19)
