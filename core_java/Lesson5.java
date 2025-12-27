// Package is a way to group multiple classes, interfaces, etc., into a a self contained structure.
// A single package is used to indicate a single domain or function.
// package core_java;

class Animal {
  void sound() {
    System.out.println("Animal sound");
  }
}

// Inheritance is a feature in java which allows one class to acquires the methods and attributes of
// another. Subclasses can also "override" the method of the original class
class Dog extends Animal {
  @Override // Override annotation, although not necessasary, is helpful when overriding methods.
  void sound() {
    System.out.println("Bark");
  }
}

// Abstraction is a technique/principle in OOPs languages to hide the inner workings of a class from
// the calling environment. There are many ways to implement abstractions in java, abstract classes
// is one method using which abstractions can be implemented.

// Abstract class are not fully implemented when they are declared. Abstract classes cannot be
// instantiated. A subclas of an abstract class must implement the class fully to be instantiated
// (unless the subclass is also abstract). Abstract class is used to provide blueprint for creating
// a class.
abstract class Shape {
  abstract double area();
}

// Here Circle completely implements Shape
class Circle extends Shape {
  double radius = 0.0;

  @Override
  double area() {
    return Math.PI * radius * radius;
  }

  Circle(double radius) {
    this.radius = radius;
  }
}

// Encapsulation is a technique in OOPs languages to hide and isolate internal data from outside.
// This helps in making sure that internal state is mutated by the class itself.
class Account {
  // Private fields are used to ensure encapsulation
  private int balance;

  public int getBalance() {
    return balance;
  }
}

// Interfaces are like abstract classes, but they contain no concrete methods. Interfaces are used
// to define behaviour rather than structure. Classes that implement a interface must provide
// concrete implementations of all the methods declared in the interface.
interface Flyable {
  void fly();
}

// Here class Sparrow implements Flyable. Methods declared in interfaces must be made public.
class Sparrow implements Flyable {
  public void fly() {
    // concrete implementations
  }
}

public class Lesson5 {
  public static void main(String[] args) {
    // Polymophism is a feature in java which allows methods and class to reuse code for various
    // different inputs. In this case any method which requires a member of Animal class can also
    // accept a instance of a subclass (Dog in this case).
    Animal a = new Dog();
    a.sound(); // Bark
  }
}
