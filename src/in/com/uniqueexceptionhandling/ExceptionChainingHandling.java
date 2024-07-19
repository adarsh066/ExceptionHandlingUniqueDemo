package in.com.uniqueexceptionhandling;

import java.io.FileNotFoundException;

/**
 * Author: Aadarsh Patil 
 * Description: This class demonstrates exception chaining
 * by wrapping a FileNotFoundException inside a custom exception.
 */
public class ExceptionChainingHandling {

	public static void main(String[] args) {
		try {
			// Attempting to process a file, which may throw a custom exception
			processFile("nonexistentfile.txt");
		} catch (FileProcessingException e) {
			// Handling the custom FileProcessingException
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void processFile(String fileName) throws FileProcessingException {
		try {
			// Simulating a file processing operation that may throw FileNotFoundException
			throw new FileNotFoundException("File not found: " + fileName);
		} catch (FileNotFoundException e) {
			// Wrapping FileNotFoundException inside a custom exception
			throw new FileProcessingException("Error processing file: " + fileName, e);
		}
	}
}

//If nonexistentfile.txt does not exist:

//Error: Error processing file: nonexistentfile.txt
//in.com.uniqueexceptionhandling.FileProcessingException: Error processing file: nonexistentfile.txt
//	at in.com.uniqueexceptionhandling.ExceptionChainingHandling.processFile(ExceptionChainingHandling.java:29)
//	at in.com.uniqueexceptionhandling.ExceptionChainingHandling.main(ExceptionChainingHandling.java:15)
//Caused by: java.io.FileNotFoundException: File not found: nonexistentfile.txt
//	at in.com.uniqueexceptionhandling.ExceptionChainingHandling.processFile(ExceptionChainingHandling.java:26)
//	... 1 more