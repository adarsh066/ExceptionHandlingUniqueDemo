package in.com.uniqueexceptionhandling;

/**
 * Author: Aadarsh Patil 
 * Description: This class demonstrates the use of custom
 * exceptions.
 */
public class CustomExceptionHandling {

	public static void main(String[] args) {
		int age = 18;
		try {
			// Checking the age and throwing custom exception if age is less than 18
			validateAge(age);
		} catch (InvalidAgeException e) {
			// Handling the custom InvalidAgeException
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or older.");
		} else {
			System.out.println("Age is valid.");
		}
	}
}

//If age is set to 16:
//	Error: Age must be 18 or older.
//	in.com.uniqueexceptionhandling.InvalidAgeException: Age must be 18 or older.
//		at in.com.uniqueexceptionhandling.CustomExceptionHandling.validateAge(CustomExceptionHandling.java:24)
//		at in.com.uniqueexceptionhandling.CustomExceptionHandling.main(CustomExceptionHandling.java:14)


//If age is set to 18:
//Age is valid.
