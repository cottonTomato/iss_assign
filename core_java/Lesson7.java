import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Collections is a framework that is designed to provide standard interfaces.
// These interfaces include, but are not limited to: Lists, Sets, Maps, Queues, etc.
// Various implementations of these interfaces exist in the java.util package.
// For lists we have: ArrayList, LinkedList, Vector, etc.
// For sets we have: HashSet, TreeSet, etc.
// All these implementations have their own pros & cons and deciding which one
// to use is one of the key factor in writing good code.

// Custom class for demonstration.
// This class implements Comparable for sorting operations.
class Student implements Comparable<Student> {
  int id;
  String name;

  Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int compareTo(Student s) {
    return this.id - s.id;
  }
}

public class Lesson7 {
  public static void main(String[] args) {
    // Lists define an interface for a sequentially-accessible array of like-objects.
    List<Student> studentList = new ArrayList<>(); // ArrayList is one implementation of List
    // add method of list is used to append data to the end of the list
    studentList.add(new Student(1, "Abhinav"));
    studentList.add(new Student(5, "Yuvraj"));
    studentList.add(new Student(4, "Gayatri"));
    studentList.add(new Student(2, "Drishti"));
    studentList.add(new Student(3, "Pulkit"));

    // ArrayLists of Primitive types (like int, double, float) can be sorted using sort method.
    // Sort takes a closure that implements the Comparator interface. Another method for sorting
    // is to use Collections.sort This method requires the class to implement the Comparable
    // interface. This interface is already implemented for most standard primitive types.
    Collections.sort(studentList);

    // Sets provide an interface for a collection of unique like-objects
    Set<Student> studentSet = new HashSet<>(); // HashSet is one implementation of Set
    // add method of set is used to add data to the set
    studentSet.add(new Student(1, "Abhinav"));

    // Map provide an interface for a key-value pair type collection
    Map<Integer, Student> studentMap = new HashMap<>();
    // put method of map is used to add a key-value pair to the map
    studentMap.put(1, new Student(1, "A"));
  }
}
