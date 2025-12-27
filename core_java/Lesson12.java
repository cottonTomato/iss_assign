// File handling is the ability to create, delete &
// modify files that exist on the file system.
// Java provides FileWriter & FileReader for this.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson12 {

  public static void main(String[] args) {
    // Writing to file can be achieved using FileWriter. Here
    // we again make use of the Try-with-resources block to
    // close the FileWriter object automatically.
    try (FileWriter fw = new FileWriter("a.txt")) {
      fw.write("Hello");
    } catch (IOException e) {
      System.out.println("Error while reading file");
    }

    // Reading a file is done similarly. Here we make use of
    // BufferedReader to read the file line by line.
    try (BufferedReader br = new BufferedReader(new FileReader("a.txt"))) {
      System.out.println(br.readLine());
    } catch (IOException e) {
      System.out.println("Error while writing file");
    }
  }
}
