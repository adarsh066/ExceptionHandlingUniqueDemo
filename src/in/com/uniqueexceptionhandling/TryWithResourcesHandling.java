package in.com.uniqueexceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Author: Aadarsh Patil 
 * Description: This class demonstrates the use of
 * try-with-resources for automatic resource management.
 */
public class TryWithResourcesHandling {

	public static void main(String[] args) {
		// Using try-with-resources to ensure the file reader is closed automatically
		try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
			String line;
			// Reading and printing the content of the file line by line
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// Handling IOException that might occur during file reading
			System.err.println("An IOException occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
