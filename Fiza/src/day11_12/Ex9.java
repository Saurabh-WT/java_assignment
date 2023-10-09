package day11_12;
//9. Finally Block Usage:
//Write a program that reads data from a database.
// Use a try-catch-finally block to ensure that database resources are properly closed, even if an exception occurs.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex9 {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Define database connection parameters
            String url = "jdbc:mysql://127.0.0.1:3306/fiza";
            String username = "root";
            String password = "";

            // Establish a database connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // Execute a database query (replace with your SQL query)
            String query = "SELECT * FROM table_1";
            resultSet = statement.executeQuery(query);

            // Process the query result (print it, for example)
            while (resultSet.next()) {
                // Process and print data here
                System.out.print(" ID: " + resultSet.getString("id"));
                System.out.print(", Roll Number: " + resultSet.getString("roll_no."));
                System.out.print(", Name: " + resultSet.getString("name"));
                System.out.print(" and Department: " + resultSet.getString("depart"));

                System.out.println();
                // Add more columns as needed
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            // Close database resources in the finally block to ensure they are always closed
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

