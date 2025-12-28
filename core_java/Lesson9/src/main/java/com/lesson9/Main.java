// JSON is a serialization format for data. It stands
// for JavaScript Object Notation. It is used to send
// and receive data in structured format over the
// internet. It is very human friendly to read.
// JSON can contain the usual datatypes like: numbers,
// strings, arrays, and other object.

package com.lesson9;

// In this example we use the Google Gson library to
// convert java objects to JSON & vice versa.
import com.google.gson.Gson;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // print method for utility
    void print() {
        System.out.printf("id: %d, name: %s\n", id, name);
    }
}


public class Main {
    public static void main(String[] args) {
        // We must create a Gson object before we can serialize
        // and deserialize data.
        Gson gson = new Gson();

        Student student1 = new Student(1, "Abhinav");
        student1.print();

        // toJson method of Gson converts java objects to JSON.
        // It does so by reading the fields in the object.
        String student1JSON = gson.toJson(student1);
        System.out.println(student1JSON);

        String student2JSON = "{\"id\":2,\"name\":\"Drishti\"}";
        System.out.println(student2JSON);

        // fromJson is used to convert back JSON to java objects.
        // For this we need to supply the JSON string as well as
        // the Class of the final object.
        Student student2 = gson.fromJson(student2JSON, Student.class);
        student2.print();
    }
}