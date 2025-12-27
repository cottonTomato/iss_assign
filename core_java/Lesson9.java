// JSON is a human-readable data serialization format.
// It is used to send data across programs, servers
// over various protocols. Java provides built-in
// method to serialize & deserialize data into objects
// and vice-versa.

class Student {
  int id;
  String name;

  Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // This method converts Student object to JSON.
  // In a production environment we would use 3rd
  // party libraries like Gson or Jackson but
  // due to limitations in build system we are
  // using a ad-hoc method.
  String toJson() {
    return "{\"id\":" + id + ",\"name\":\"" + name + "\"}";
  }
}

public class Lesson9 {
  public static void main(String[] args) {
    Student s1 = new Student(1, "Abhinav");
    System.out.println(s1.toJson());
  }
}
