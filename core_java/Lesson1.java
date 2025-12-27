// Basics of Java

// Definition of a basic class
class Student {
  int id; // state (instance variable)
  String name;

  void display() { // behavior (method)
    System.out.println(id + " " + name);
  }
}

public class Lesson1 {
  public static void main(String[] args) {
    Student s = new Student(); // object
    s.id = 1;
    s.name = "Abhinav";
    s.display();
  }
}
