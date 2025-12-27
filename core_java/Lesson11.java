import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Jdbc stands for Java Database Connectivity. It is a api
// used to connect and query databases using java. It is
// mostly used to work with relational databases and SQL
// databases.

public class Lesson11 {

  public static void main(String[] args) {

    // These are the details like the endpoint of the mysql server
    // the username and the password.
    String url = "jdbc:mysql://localhost:3306/school";
    String user = "root";
    String password = "password";

    // A SQL query string is used to query the database.
    String query = "SELECT id, name, age FROM student";

    // Try-with-resources block automatically closes connection
    // in case of any error. Without Try-with-resources we would
    // have to use finally block and close connection manually.
    // Multiple statements are allowed in Try-with-resources
    // block all the resorses are closed by JVM automatically.
    try (Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query)) {
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int age = rs.getInt("age");

        System.out.println(id + " " + name + " " + age);
      }

    } catch (SQLException e) {
      // In case of any SQLException this block is run
      System.out.println("SQLException");
    }
  }
}
