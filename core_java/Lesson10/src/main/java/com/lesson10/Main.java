// XML is another human-readable, data serialization format.
// It focuses more on structure and uses a tag based language
// like HTML. XML is also widely used over the internet to
// send and receive data.
package com.lesson10;

// We use Jakarta XML Binding API for this purpose.
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;
import java.io.StringWriter;

// Random Dummy class for demonstration
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
        Student s1 = new Student(1, "Abhinav");
        String s2xml = "<student><id>2</id><name>Drishti</name></student>";

        // This is done in a try-catch block as many JAXB methods
        // throw JAXBException
        try {
            // For any kind of serialization/deserialization we first
            // need to create an instance of JAXBContext. This requires
            // us to supply the class that we want to
            // serialization/deserialization
            JAXBContext context = JAXBContext.newInstance(Student.class);
            // From that instance we create a Marshaller which will
            // actually do the serialization
            Marshaller marshaller = context.createMarshaller();
            // We set a property so that the outputted XML is formatted
            // for viewing
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter writer = new StringWriter();
            // Marshaller takes an instance of StringWriter and the
            // original java object
            marshaller.marshal(s1, writer);
            String s1xml = writer.toString();

            System.out.println(s1xml);

            // We now create an unmarshaller for deserialization
            // this is again provided by the same JAXBContext
            // instance
            Unmarshaller unmarshaller = context.createUnmarshaller();

            StringReader reader = new StringReader(s2xml);
            // Unmarshaller takes an instance of StringReader and
            // returns deserialized object as an instance of Object
            // class. We cast this instance to the correct class
            Student s2 = (Student)unmarshaller.unmarshal(reader);

            s2.print();
        } catch (JAXBException e){
            System.out.println("JAXBException");
            e.printStackTrace();
        }
    }
}