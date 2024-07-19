package in.com.uniqueexceptionhandling;

import java.io.FileNotFoundException;

/**
 * Author: Aadarsh Patil 
 * Description: This class represents a custom exception
 * for file processing errors.
 */
class FileProcessingException extends Exception {
	public FileProcessingException(String message, Throwable cause) {
		super(message, cause);
	}
}