package in.com.uniqueexceptionhandling;

/**
 * Author: Aadarsh Patil
 * Description: This class demonstrates rethrowing exceptions with improved stack trace information.
 */
public class RethrowExceptionHandling {

    public static void main(String[] args) {
        try {
            // Attempting to perform an operation that may throw an exception
            performOperation();
        } catch (Exception e) {
            // Catching and rethrowing the exception with additional context
            throw new RuntimeException("Error occurred while performing operation", e);
        }
    }

    public static void performOperation() throws Exception {
        try {
            // Simulating an operation that throws an exception
            throw new Exception("Original exception message");
        } catch (Exception e) {
            // Rethrowing the exception with additional context
            throw new Exception("Exception in performOperation method", e);
        }
    }
}

//The console output will be:
//Result :

//Exception in thread "main" java.lang.RuntimeException: Error occurred while performing operation
//at in.com.uniqueexceptionhandling.RethrowExceptionHandling.main(RethrowExceptionHandling.java:14)
//Caused by: java.lang.Exception: Exception in performOperation method
//at in.com.uniqueexceptionhandling.RethrowExceptionHandling.performOperation(RethrowExceptionHandling.java:25)
//at in.com.uniqueexceptionhandling.RethrowExceptionHandling.main(RethrowExceptionHandling.java:11)
//Caused by: java.lang.Exception: Original exception message
//at in.com.uniqueexceptionhandling.RethrowExceptionHandling.performOperation(RethrowExceptionHandling.java:22)
//... 1 more
