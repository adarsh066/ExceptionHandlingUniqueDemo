package in.com.uniqueexceptionhandling;

/**
 * Author: Aadarsh Patil 
 * Description: This class represents a custom exception
 * for invalid age.
 */
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}