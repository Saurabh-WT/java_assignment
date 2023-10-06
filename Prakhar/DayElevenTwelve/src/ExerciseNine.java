import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExerciseNine {
    //9. Finally Block Usage:
    //Write a program that reads data from a database. Use a try-catch-finally block to ensure that database
    // resources are properly closed, even if an exception occurs.

    public static void main(String[] args) {
        // JDBC URL for an H2 in-memory database
        String jdbcUrl = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1"; // Use DB_CLOSE_DELAY to keep the database open

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Establish a database connection
            connection = DriverManager.getConnection(jdbcUrl);

            // Step 2: Create a table
            statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (" + "employee_id INT AUTO_INCREMENT " +
                    "PRIMARY KEY," + "employee_name VARCHAR(255))";
            statement.execute(createTableSQL);

            // Step 3: Insert data into the table
            String insertSQL = "INSERT INTO employees (employee_name) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, "Prakhar Sharma");
            preparedStatement.executeUpdate();

            // Step 4: Retrieve and display data
            String selectSQL = "SELECT * FROM employees";
            resultSet = statement.executeQuery(selectSQL);

            while (resultSet.next()) {
                int empId = resultSet.getInt("employee_id");
                String empName = resultSet.getString("employee_name");
                System.out.println("Employee ID: " + empId + ", Employee Name: " + empName);
            }

        } catch (SQLException e) {
            System.err.println("Database Error: " + e.getMessage());
        } finally {
            // Step 5: Close database resources in the finally block
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
                System.err.println("Error closing database resources: " + e.getMessage());
            }
        }
    }
}
