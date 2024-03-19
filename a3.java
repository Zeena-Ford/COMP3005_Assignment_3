import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Zeena Ford, 101229954
 * @version March 18 2024
 */


import java.sql.*;

public class a3 {

    // Get all students from the 'students' database
    private static void getAllStudents() {
        //url code containing the local host, user, password and name for the database
        String url = "jdbc:postgresql://localhost:5432/Assignment 3";
        String user = "postgres";
        String password = "datapass";
        try {
            Class.forName("org.postgresql.Driver");
            //enabling connection between the database and the application using the provided driver
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            //executing database query to output the records from 'students' database
            statement.executeQuery("select * from STUDENTS");
            ResultSet resultSet = statement.getResultSet();
            //iterate through the table to output the provided results
            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
                System.out.println(resultSet.getString("last_name"));
                System.out.println(resultSet.getString("email"));
                System.out.println(resultSet.getString("enrollment_date"));
            }
            //catch exception and print results
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // Add a student to the students database
    private static void addStudent() {
        //url code containing the local host, user, password and name for the database
        String url = "jdbc:postgresql://localhost:5432/Assignment 3";
        String user = "postgres";
        String password = "datapass";
        try {
            Class.forName("org.postgresql.Driver");
            //enabling connection between the database and the application using the provided driver
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            //query to insert the specified arguments within the table to ultimately add a student within the database
            String query = "INSERT INTO students (first_name, last_name, email, enrollment_date) VALUES ('Lilly', 'Turner', 'lilly.turner@example.com', '2024-04-04')";
            statement.executeUpdate(query);
            statement.executeQuery("select * from STUDENTS");
            ResultSet resultSet = statement.getResultSet();
            //iterate through the table to output the provided results to display the records including the added student
            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
                System.out.println(resultSet.getString("last_name"));
                System.out.println(resultSet.getString("email"));
                System.out.println(resultSet.getString("enrollment_date"));
            }
            //catch exception and print results
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // Update student email in the 'students' database
    private static void updateStudentEmail() {
        //url code containing the local host, user, password and name for the database
        String url = "jdbc:postgresql://localhost:5432/Assignment 3";
        String user = "postgres";
        String password = "datapass";
        try {
            Class.forName("org.postgresql.Driver");
            //enabling connection between the database and the application using the provided driver
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            //query to update the email associated with the student id
            String query = "UPDATE students SET email = 'newemail@example.com' WHERE student_id = 1";
            statement.executeUpdate(query);
            statement.executeQuery("select * from STUDENTS");
            ResultSet resultSet = statement.getResultSet();
            //iterate through the table to output the provided results to display the records including the updated email
            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
                System.out.println(resultSet.getString("last_name"));
                System.out.println(resultSet.getString("email"));
                System.out.println(resultSet.getString("enrollment_date"));
            }
            //catch exception and print results
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // Delete a student from the 'students' database
    private static void deleteStudent() {
        //url code containing the local host, user, password and name for the database
        String url = "jdbc:postgresql://localhost:5432/Assignment 3";
        String user = "postgres";
        String password = "datapass";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            //query to delete the student with the given student id
            String query = "DELETE FROM students WHERE student_id = 11";
            statement.executeUpdate(query);
            //execute query after deleting the specified student
            statement.executeQuery("select * from STUDENTS");
            ResultSet resultSet = statement.getResultSet();
            //iterate through the table to output the provided results to display the records including the deleted student
            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
                System.out.println(resultSet.getString("last_name"));
                System.out.println(resultSet.getString("email"));
                System.out.println(resultSet.getString("enrollment_date"));
            }
            //catch exception and print results
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Main signature for compiling the given functions
    public static void main(String[] args) {

        //getAllStudents();
        //addStudent();
        //updateStudentEmail();
        //deleteStudent();
    }


}
