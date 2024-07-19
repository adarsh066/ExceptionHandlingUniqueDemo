package in.com.uniqueexceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Author: Aadarsh Patil 
 * Description: This class demonstrates handling multiple
 * exceptions in a single catch block.
 */
public class MultiCatchHandling {

	public static void main(String[] args) {
		try {
			// Attempting to process a file, which may throw multiple exceptions
			processFile("example.txt");
		} catch (IOException | IllegalArgumentException e) {
			// Handling multiple exceptions in a single catch block
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void processFile(String fileName) throws IOException, IllegalArgumentException {
		if (fileName == null || fileName.isEmpty()) {
			// Throwing IllegalArgumentException if the file name is invalid
			throw new IllegalArgumentException("File name cannot be null or empty.");
		}
		// Using try-with-resources to ensure the file reader is closed automatically
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			// Reading and printing the content of the file line by line
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
}


//If example.txt contains:
//Result : 
//	Hello World!
//	This is a sample file.
//	It contains multiple lines of text.
//	This is the fourth line.

//---------------------------------------
//If example.txt does not exist:
//Result :
//	Error: example.txt (No such file or directory)
//	java.io.FileNotFoundException: example.txt (No such file or directory)
//	    at java.base/java.io.FileInputStream.open0(Native Method)
//	    at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//	    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//	    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
//	    at java.base/java.io.FileReader.<init>(FileReader.java:60)
//	    at in.com.uniqueexceptionhandling.MultiCatchHandling.processFile(MultiCatchHandling.java:23)
//	    at in.com.uniqueexceptionhandling.MultiCatchHandling.main(MultiCatchHandling.java:14)

//---------------------------------------
//If fileName is null or empty:
//Result : 
//	Error: File name cannot be null or empty.
//	java.lang.IllegalArgumentException: File name cannot be null or empty.
//	    at in.com.uniqueexceptionhandling.MultiCatchHandling.processFile(MultiCatchHandling.java:16)
//	    at in.com.uniqueexceptionhandling.MultiCatchHandling.main(MultiCatchHandling.java:14)

