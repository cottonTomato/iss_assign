// Basic datatypes

class DatatypeDemo {
  int x = 45; // Integer type
  double y = 3.14; // Floating point type
  String name = "Abhinav"; // Character string
}

class AccessModifierDemo {
  public int x = 32; // public can be accessed from outside the class
  private int y = 33; // private can only be accessed from within the class
  protected int z = 34; // protected only can be accessed from within the class and by subclass
  int a = 35; // default is public for classes in same file but private outside
}

class NonAccessModifiers {
  static int x = 32; // makes the field belong to the class rather than one instance
  final int y = 33; // makes the field immutable

  // others modifiers like abstract, synchronized, synchronized
}

class ConstructorDemo {
  private int value; // access modifier

  // Constructors are used to initialize fields inside a class
  ConstructorDemo(int value) { // constructor
    this.value = value;
  }
}
