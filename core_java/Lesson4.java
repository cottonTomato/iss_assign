public class Lesson4 {
  public static void main(String[] args) {
    // String are used to store a sequence of characters in java.
    // In java strings are immutable. Therefore many auxiliary class
    // exist to support their function, like StringBuilder, StringBuffer, etc.
    String s = "Java"; // Strings are created using "double quotes"
    System.out.println(s.length()); // Strings provide various methods for manipulation

    // Strings can also be created using a ascii byte array
    byte ascii[] = {71, 70, 71};
    String s2 = new String(ascii); // Creating String using byte array
    System.out.println(s2);

    // Arrays are data structures that store elements of same type in a sequential format
    int[] arr = {1, 2, 3}; // Create array using {}. Notice the [] appended to type of the element
    // Array can also be created using new keyword. 5 is the size of the array
    int[] arr2 = new int[5];

    // Elements can be accessed using [n] notation. It returns the n-th element in a 0-indexed
    // manner.
    System.out.println(arr[0]);

    // For loop can be used to access each element of the array
    for (int i = 0; i < arr.length; i++) { // Arrays contain additional members for utility
      System.out.println(arr[i]);
    }
    // For each loop can be used to iterate without using a index
    for (int element : arr) {
      System.out.println(element);
    }
  }
}
