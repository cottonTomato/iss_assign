import java.io.IOException;

// Exceptions in java are used to throw, propoagte and handle errors. Exceptions are of 3 types
// Checked exceptions, Unchecked exceptions and Errors.
// 1. A checked exception is an exception that is checked (notified) by the compiler at
//    compilation-time. Also called compile time exception.
// 2. An unchecked exception is an exception that occurs at the time of execution. Also called
//    runtime exception.
// 3. Errors are errors that happen due to external reasons (os, hardware). They are outside the
//    control of JVM and often leads to JVM abort & exit.

// Java Exception Hierarchy
// All exception classes are subtypes of the java.lang.Exception class. The exception class is a
// subclass of the Throwable class. Other than the exception class there is another subclass called
// Error which is derived from the Throwable class.

public class Lesson6 {
  public static void main(String[] args) {
    // Error handling in java is done using try-catch-finally block.
    // Any error raised in try block is caught by the corresponding
    // catch block. Catch block only handles the error of type it
    // declares. Finally block is used for cleanup and is always run.

    try {
      int x = 10 / 0; // This raises an ArithmeticException in java
      throw new IllegalArgumentException("Invalid"); // throw is used to throw a Exception of choice
    }
    // Catch block is declared to catch ArithmeticException. Any other Exception will pass through
    catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
    }
    // This catch block catches all errors that can be thrown
    catch (Exception e) {
      System.out.println("Exception");
    } finally {
      System.out.println("Done");
    }
  }

  // Throws keyword is used to indicate what exceptions a function _can_ throw.
  // When mentioned in this way the JVM ensures the the calling functinons
  // either handles or declares a thorws in the signature.
  void read() throws IOException {
    // pass
  }
}
